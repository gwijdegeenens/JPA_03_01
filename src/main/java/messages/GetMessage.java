package messages;

import javax.persistence.*;

public class GetMessage {
   public static void main(String[] args) {
      EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("course");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();
      tx.begin();
      Message message = em.find(Message.class, 1L);
      System.out.println(message.getText());
      tx.commit();
      em.close();
      emf.close();
   }
}
