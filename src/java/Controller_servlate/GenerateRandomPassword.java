/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import java.util.Date;

/**
 *
 * @author ahmed
 */
public class GenerateRandomPassword {
    public    int  generate(){
        
       int randonMath=100 + (int) (Math.random( ) *1000000);
      int second=   new Date().getSeconds();
         return randonMath+second;
    }
     
}