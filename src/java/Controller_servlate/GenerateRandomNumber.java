/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_servlate;

import java.util.Date;
import java.util.Random;
import static java.util.stream.StreamSupport.intStream;

/**
 *
 * @author ahmed
 */
public class GenerateRandomNumber {
    public   int  generate(){
        
       int randonMath=100 + (int) (Math.random( ) *10000);
      int second=   new Date().getSeconds();
         return randonMath+second;
    }}