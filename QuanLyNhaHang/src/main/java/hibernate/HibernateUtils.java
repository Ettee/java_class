/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import hibernate.pojo.Booking;
import hibernate.pojo.BookingDichVu;
import hibernate.pojo.DichVu;
import hibernate.pojo.Menu;
import hibernate.pojo.SanhCuoi;
import hibernate.pojo.User;
import hibernate.pojo.UserType;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Ettee
 */
public class HibernateUtils {
    private static final SessionFactory FACTORY;
    
    static {
        Configuration conf = new Configuration();
        
        Properties props = new Properties();
        props.put(Environment.DIALECT,
            "org.hibernate.dialect.MySQLDialect");
        props.put(Environment.DRIVER,
            "com.mysql.cj.jdbc.Driver");
        props.put(Environment.URL,
            "jdbc:mysql://127.0.0.1/quanlynhahang");
        props.put(Environment.USER, "root");
        props.put(Environment.PASS, "12345678");
        props.put(Environment.SHOW_SQL,"true");
        conf.setProperties(props);
        
        conf.addAnnotatedClass(DichVu.class);
        conf.addAnnotatedClass(Booking.class);
        conf.addAnnotatedClass(BookingDichVu.class);
        conf.addAnnotatedClass(Menu.class);
        conf.addAnnotatedClass(SanhCuoi.class);
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(UserType.class);
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);
        
        
        
    }
    /**
     * @return the FACTORY
     */
    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    static SessionFactory getSessionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
