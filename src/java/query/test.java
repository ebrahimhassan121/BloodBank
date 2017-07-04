/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

 import entities.Bloodtype;
import entities.Donors;
import entities.Hospital;
import entities.Phones;
import entities.Timeclose;
import entities.Timespace;
import entities.Users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class test {

    public static void main(String[] args) throws SQLException {
//        CheckDatabase cd=new CheckDatabase();
//       Connection con= cd.check();
//       if(con==null){
//           System.out.println("fail");
//       }else{
//           System.out.println("sucess");
//       }

        Users user = new Users();
//Model_users crud=new Model_users();
//CRUD_hospital crud1=new CRUD_hospital();
//user.setName("ibrahim hassin");
//user.setPassword("999");
//user.setEmail("ww33@88");
//user.setPhonrnumber("0127827");
//user.setBirthdate("22-10-1998");
//user.setSsn(77);
//int x=crud.insert_user(user);
//        System.out.println(x);

//List<Users> l=new ArrayList<>();
//l=crud.select_user("ahmed salama", "999");
//        for (Users users : l) {
//            System.out.println(users.getName());
//           System.out.println(users.getPhonrnumber());
//
//            
//        }
//int x=crud.check_user("ahmed", "11");
//        System.out.println(x);
//String x=crud. select_email("ahmed", "11");
//        System.out.println(x);
//int x=crud.update_name("aa12", "kk", "ahmed salama");
//        System.out.println(x);
//        Hospital h=new Hospital();
//        h.setName("kopi");
//        h.setPassword("22");
//        h.setEmail("ww@qq");
//        h.setAddress("ee-ee-wwew");
//        int x=crud1.insert_hospital(h);
//        System.out.println(x);
//    List<Hospital> l=new ArrayList<>();
//l=crud1.select_user("kopi", "22");
//        for (Hospital hospital : l) {
//            
//        
//            System.out.println(hospital.getName());
//           System.out.println(hospital.getEmail());
//
//            
//        }
//int id =crud1.select_id_hospital("misr", "99");
//        Phones p=new Phones();
//        p.setPhone("012");
//    int x = crud1.insert_phone_hospital(p,id);
//    
//        System.out.println(id);
//     
//List<Phones> l=new ArrayList<>();
//ArrayList<String> x=crud1.select_phone_hospittal(1);
//           for (int i = 0; i < x. size(); i++) {
//               System.out.println(x.get(i));
//        }
        Timeclose t = new Timeclose();
        Timespace t1 = new Timespace();
        Model_Timeclose tt = new Model_Timeclose();
        Model_timespace m = new Model_timespace();
        Donors d = new Donors();
        Model_donors mm = new Model_donors();
        Bloodtype b = new Bloodtype();
        Model_typeblood model_typeblood = new Model_typeblood();
//  t.setTime("3:00");
//t.setDate(new Date().toString());
//t.setBloodtrpe("O+");
//t.setHospital_id(1);
//t.setDonar_id(999);
//int x=tt.insert_timeclose(t);
//
//        System.out.println(x);

//   ResultSet ll=tt.select_timeclose(1);
//        while (ll.next()) {
//            System.out.println(ll.getString(2));
//            System.out.println(ll.getString(3));
//            System.out.println(ll.getString(4));
//            System.out.println(ll.getString(6));
//        }
//        tt.closeResultSet();
//t1.setHospital_id(1);
// t1.setTime("8:00");
//int xd=m. delet_timespace(1);
//int x=m.insert_timespace(t1);
//        System.out.println(x);
//    d.setBloodtype("A+");
//    d.setBloodstatus("true");
//    d.setDescription("lab   la a la al ala l ala l");
//    d.setHospital_id(1);
//    d.setNumber_of_bags(2);
//    d.setSsn(22);
//    
//        System.out.println( mm.insert_donor(d));
//b.setCount(1000);
//b.setHospital_id(2);
//int x=model_typeblood. insert_bloodtype(b, "bpositive");
//        System.out.println(x);
        int r = 0;
//Model_hospital m1=new Model_hospital();
//r=m1.select_id_hospital("الدمرداش", "1234");
//        System.out.println(r);
//Model_typeblood m1=new Model_typeblood();
//r=m1.selectCountBlood(14, "anegative");
//        System.out.println(r);
//        r=m1.selectCountBlood(14, "opositive");
//                System.out.println(r);
//        Model_users m1 = new Model_users();
//        ResultSet re = m1.selectUserNAP(8888);
//        while (re.next()) {
//            System.out.println(re.getString(1));
//            System.out.println(re.getString(2));
//
//            System.out.println(re.getString(3));
//
//        }
//        m1.closeResultSet();
//Model_hospital m1=new Model_hospital();
//int q=m1.update_street_hospital("لاتلا",14);
       //  System.out.println("knk"+m1.selectHospittalName(14));
 

// Model_users m1=new Model_users();
//        System.out.println( m1.selectUserNmaeByEmail("ahmed.s.fci2015@ gmail.com"));
 
//Model_donors m1=new Model_donors();
//        System.out.println(m1.selectDonorBloodType(14, 8888));

//        SendPassword password=new SendPassword();
//        password.send("ahmed.salama.fci2015@gmail.com", "ddd",101010);
Model_timespace model_timespace=new Model_timespace();
// ResultSet rs=model_timespace. select_time(14);
//    String time="";
//    while (rs.next()){
//       time=time+"  "+  rs.getString(1) ;
//        
//    }
//        System.out.println(time); 

    }
}
