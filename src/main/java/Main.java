import domain.Healer;
import domain.Surgeon;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by r.pogorelov on 14.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuration.getProperties()).buildServiceRegistry();
        Session session = configuration.buildSessionFactory(serviceRegistry).openSession();

        Transaction transaction = session.beginTransaction();
        Healer h1 = new Healer();
        h1.setName("healer1");
        h1.setAmountOfHerbs(100);

        Surgeon s1 = new Surgeon();
        s1.setName("surgeon1");
        s1.setAmountOfRemovedLimbs(5);
        s1.setAmountOfReplacedLimbs(10);

        session.persist(h1);
        session.persist(s1);

        transaction.commit();
        session.close();
    }
}
