package messages;

import javax.persistence.*;

public class SaveMessage {
   public static void main(String[] args) {
      EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("course");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();
      tx.begin();
      Message message = new Message(2, "Hello World");
      em.persist(message);
      tx.commit();
      em.close();
      System.out.println("Message saved");
   }
}
