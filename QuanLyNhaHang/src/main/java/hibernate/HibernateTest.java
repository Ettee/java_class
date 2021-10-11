/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import hibernate.pojo.BookingDichVu;
import hibernate.pojo.DichVu;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ettee
 */
public class HibernateTest {
    public static void main (String []agrs){
        Session session = HibernateUtils.getFACTORY().openSession();
// Add data
//        DichVu dv = new DichVu();      
//        dv.setName_dichvu("dichvu_6");
//        dv.setDesc_dichvu("lorem isum alabatrap");
//        dv.setPrice_dichvu(20000.0);
//        session.save(dv);

// Get and update data
//        DichVu dv = session.get(DichVu.class,1);
//        dv.setDesc_dichvu("test update thanh cong");
//        session.getTransaction().begin();
//        session.save(dv);
//        session.getTransaction().commit();
// Get data by query
//        Query q = session.createQuery("FROM DichVu where id =6");
//        List<DichVu> res = q.getResultList();
//        res.forEach(r -> System.out.println(r.getPrice_dichvu()));
//        session.close();
          Query q = session.createQuery("From BookingDichVu");
          List <BookingDichVu> res = q.getResultList();
          res.forEach(r ->System.out.printf("%d\n", r.getId_booking()));
    }
}
