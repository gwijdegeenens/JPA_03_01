package messages;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveAndGetMessage {
   public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("course");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();
      tx.begin();

      Message message = new Message(20, "Hello World");
      em.persist(message);

      Message messageFound = em.find(Message.class, message.getId());
      System.out.println(messageFound.getText());

      tx.commit();
      em.close();
      System.out.println("Message saved");
   }
}
