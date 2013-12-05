/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleu.are.u.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author djadoremus
 */
public class HibernateUtil {

    private SessionFactory sf;
    private Configuration conf;
    private static HibernateUtil hibernateUtil;

    private HibernateUtil() {
        conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        ServiceRegistryBuilder srb = new ServiceRegistryBuilder().applySettings(conf.getProperties());
        ServiceRegistry sr = srb.buildServiceRegistry();
        sf = conf.buildSessionFactory(sr);
    }

    public static HibernateUtil getInstance() {
        if (null == hibernateUtil) {
            hibernateUtil = new HibernateUtil();
        }
        return hibernateUtil;
    }

    public SessionFactory getSf() {
        return sf;
    }
}
