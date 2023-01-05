package com.uniyaz.db.tests;

import com.uniyaz.db.entity.Actor;
import com.uniyaz.db.exception.InvalidIdException;
import com.uniyaz.db.exception.InvalidNameException;
import com.uniyaz.db.operations.DbOperationsActor;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DbTestActor {

    public static void main(String[] args)  {

        DbOperationsActor dbOperations = new DbOperationsActor();
        Scanner scanner = new Scanner(System.in);

        // ismeGoreGetir(dbOperations, scanner);

       // insertActor(dbOperations, scanner);

      //  update(dbOperations, scanner);

      //  deleteActorTest(dbOperations, scanner);

    }

    public static void ismeGoreGetir(DbOperationsActor dbOperations, Scanner scanner) {
        try{
            System.out.print("First Name = ");
            String firstName = scanner.nextLine();

            List<Actor> actorList1 = dbOperations.findAllActorByFirstName(firstName);
            if(actorList1.size()==0){
                throw new InvalidNameException(firstName.toUpperCase() + " TABLODA BULUNMUYOR.");
            }
            for (Actor actor : actorList1) {
                System.out.println(actor);
            }
        }catch(InvalidNameException e){
            System.out.println(e.getMessage());
        }
    }

    public static void insertActor(DbOperationsActor dbOperations, Scanner scanner) {
        Actor actor = new Actor();
        try{
            System.out.println("Eklemek istediğiniz İsim :");
            String firstName =scanner.nextLine();
            System.out.println("Eklemek istediğiniz Soyisim:");
            String lastName = scanner.nextLine();

            if(firstName.equals(" ") || lastName.equals(" ")){
                throw new InvalidNameException("Boş İsim veya Soyisim Girdiniz. Boş olmamalı.");
            }

            actor.setFirstName(firstName);
            actor.setLastName(lastName);
            actor.setLastUpdate(new Date());
            dbOperations.saveActor(actor);
            List<Actor> actorList2 = dbOperations.findAllActor();
            for (Actor actor2 : actorList2) {
                System.out.println(actor2);
            }
        }catch (InvalidNameException e){
            System.out.println(e.getMessage());
        }
    }

    public static void update(DbOperationsActor dbOperations, Scanner scanner) {
        try{
             Actor actor = new Actor();
             System.out.print("Değiştirmek İstediğiniz Id = ");
             int id=scanner.nextInt();
             System.out.println("Yeni İsim = ");
             String yeniIsim = scanner.nextLine();
             System.out.println("Yeni Soyisim = ");
             String yeniSoyIsim = scanner.nextLine();
             if(yeniIsim.equals(" ") || yeniSoyIsim.equals(" ")){
                 throw new InvalidNameException("İsim veya Soyisim boş olamaz.");
             }
             actor.setFirstName(yeniIsim);
             actor.setLastName(yeniSoyIsim);
             Date date= new Date();
             actor.setLastUpdate(date);
             actor.setId(id);
             dbOperations.updateActor(actor);

             List<Actor> actorList = dbOperations.findAllActor();
             for (Actor actor2 : actorList) {
                 System.out.println(actor2);
             }
             throw new InvalidIdException();
         }
         catch (InvalidIdException | InvalidNameException e){
             System.out.println(e.getMessage());
         }
    }

    public static void deleteActorTest(DbOperationsActor dbOperations, Scanner scanner) {
        Actor actor = new Actor();
        try{
            List<Actor> actorList = dbOperations.findAllActor();
            for (Actor actor2 : actorList) {
                System.out.println(actor2);
            }
            System.out.print("Silmek istediğiniz aktorun idsi : ");
            int id=scanner.nextInt();
            actor.setId(id);
            dbOperations.deleteActor(actor);
            List<Actor> actorList2 = dbOperations.findAllActor();
            for (Actor actor2 : actorList2) {
                System.out.println(actor2);
            }
            throw new InvalidIdException();
        } catch (InvalidIdException e){
            System.out.println(e.getMessage());
        }
    }
}
