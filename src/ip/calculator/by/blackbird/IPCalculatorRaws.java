/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.calculator.by.blackbird;

import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author Ashish Waykar
 */
public class IPCalculatorRaws {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter IP ADDRESS ");
       String ip_add = sc.nextLine();
       System.out.println("Enter Subnet Mask ");
       String subnet_mask1=sc.nextLine();
       String ip_type="";
       String nwID="";
       int cidr=0;
       System.out.println("IP Address : "+ ip_add);        
       System.out.println("Subnet Mask : "+subnet_mask1);
       String[] ipadd = ip_add.split(Pattern.quote("."));
       String ip1 = ipadd[0];
       String ip2 = ipadd[1];
       String ip3 = ipadd[2];
       String ip4 = ipadd[3];
       int ip_0 = Integer.parseInt(ip1);
       int ip_1 = Integer.parseInt(ip2);
       int ip_2 = Integer.parseInt(ip3);
       int ip_3 = Integer.parseInt(ip4);
       int ip_cl= Integer.parseInt(ip1);
       if( ip_cl <= 126 ){
               System.out.println("IP Type : A");
               ip_type="a";
               subnet_mask1="255.0.0.0";
           }
           else if( ip_cl>=127 && ip_cl <= 191 ){   
               System.out.println("IP Type : B");
               ip_type="b";
               subnet_mask1="255.255.0.0";
           }
           else if( ip_cl>= 192 && ip_cl <= 223 ){
               System.out.println("IP Type : C");
               ip_type="c";
               subnet_mask1="255.255.255.0";
           }
    System.out.println("Good IP For Host : YES");
       String cidrv = subnet_mask1;
           switch(cidrv){
           case "0.0.0.0" : cidr=0;subnet_mask1="0.0.0.0";System.out.println("No Of Hosts : 4292967294");break;
           case "128.0.0.0" : cidr=1;subnet_mask1="128.0.0.0";System.out.println("No Of Hosts : 2147483646");break;
           case "192.0.0.0": cidr=2;subnet_mask1="192.0.0.0";System.out.println("No Of Hosts : 1073741822");break;
           case "224.0.0.0": cidr=3;subnet_mask1="224.0.0.0";System.out.println("No Of Hosts : 536870910");break;
           case "240.0.0.0": cidr=4;subnet_mask1="240.0.0.0";System.out.println("No Of Hosts : 268435454");break;
           case "248.0.0.0": cidr=5;subnet_mask1="248.0.0.0";System.out.println("No Of Hosts : 134217726");break;
           case "252.0.0.0": cidr=6;subnet_mask1="252.0.0.0";System.out.println("No Of Hosts : 67108862");break;
           case "254.0.0.0": cidr=7;subnet_mask1="254.0.0.0";System.out.println("No Of Hosts : 33554430");break;
           case "255.0.0.0": cidr=8;subnet_mask1="255.0.0.0";System.out.println("No Of Hosts : 16777214");System.out.println("No. Of Subnetworks : 0");break;
           case "255.128.0.0": cidr=9;subnet_mask1="255.128.0.0";System.out.println("No Of Hosts : 8388606");System.out.println("No. Of Subnetworks : 2 (0)");break;
           case "255.192.0.0": cidr=10;subnet_mask1="255.192.0.0";System.out.println("No Of Hosts : 4194302");System.out.println("No. Of Subnetworks : 4 (2)");break;
           case "255.224.0.0": cidr=11;subnet_mask1="255.224.0.0";System.out.println("No Of Hosts : 2097150");System.out.println("No. Of Subnetworks : 8 (6)");break;
           case "255.240.0.0": cidr=12;subnet_mask1="255.240.0.0";System.out.println("No Of Hosts : 1048574");System.out.println("No. Of Subnetworks : 16 (14");break;
           case "255.248.0.0": cidr=13;subnet_mask1="255.248.0.0";System.out.println("No Of Hosts : 524286");System.out.println("No. Of Subnetworks : 32 (30)");break;
           case "255.252.0.0": cidr=14;subnet_mask1="255.252.0.0";System.out.println("No Of Hosts : 262142");System.out.println("No. Of Subnetworks : 64 (62)"); break;
           case "255.254.0.0": cidr=15;subnet_mask1="255.254.0.0";System.out.println("No Of Hosts : 131070");System.out.println("No. Of Subnetworks : 128 (126)");break;
           case "255.255.0.0": cidr=16;subnet_mask1="255.255.0.0";System.out.println("No Of Hosts : 65534");System.out.println("No. Of Subnetworks : 256 (254)");break;
           case "255.255.128.0": cidr=17;subnet_mask1="255.255.128.0";System.out.println("No Of Hosts : 32766");System.out.println("No. Of Subnetworks : 512 (510)");break;
           case "255.255.192.0": cidr=18;subnet_mask1="255.255.192.0";System.out.println("No Of Hosts : 16382");System.out.println("No. Of Subnetworks : 1024 (1022");break;
           case "255.255.224.0": cidr=19;subnet_mask1="255.255.224.0";System.out.println("No Of Hosts : 8190");System.out.println("No. Of Subnetworks : 2048 (2046)");break;
           case "255.255.240.0": cidr=20;subnet_mask1="255.255.240.0";System.out.println("No Of Hosts : 4094");System.out.println("No. Of Subnetworks : 4096 (4094)");break;
           case "255.255.248.0": cidr=21;subnet_mask1="255.255.248.0";System.out.println("No Of Hosts : 2046");System.out.println("No. Of Subnetworks : 8192 (8190))");break;
           case "255.255.252.0": cidr=22;subnet_mask1="255.255.252.0";System.out.println("No Of Hosts : 1022");System.out.println("No. Of Subnetworks : 16384 (16382)");break;
           case "255.255.254.0": cidr=23;subnet_mask1="255.255.254.0";System.out.println("No Of Hosts : 510");System.out.println("No. Of Subnetworks : 32768 (32766)");break;
           case "255.255.255.0": cidr=24;subnet_mask1="255.255.255.0";System.out.println("No Of Hosts : 254");System.out.println("No. Of Subnetworks : 65536 (65534)");break;
           case "255.255.255.128": cidr=25;subnet_mask1="255.255.255.128";System.out.println("No Of Hosts : 126");System.out.println("No. Of Subnetworks : 131072 (131070)");break;
           case "255.255.255.192": cidr=26;subnet_mask1="255.255.255.192";System.out.println("No Of Hosts : 62");System.out.println("No. Of Subnetworks : 262144 (262142)");break;
           case "255.255.255.224": cidr=27;subnet_mask1="255.255.255.224";System.out.println("No Of Hosts : 30");System.out.println("No. Of Subnetworks : 524288 (524286)");break;
           case "255.255.255.240": cidr=28;subnet_mask1="255.255.255.240";System.out.println("No Of Hosts : 14");System.out.println("No. Of Subnetworks : 1048576 (1048574)");break;
           case "255.255.255.248": cidr=29;subnet_mask1="255.255.255.248";System.out.println("No Of Hosts : 6");System.out.println("No. Of Subnetworks : 2097152 (2097150)");break;
           case "255.255.255.252": cidr=30;subnet_mask1="255.255.255.252";System.out.println("No Of Hosts : 2");System.out.println("No. Of Subnetworks : 2097152 (2097150)");break;
           case "255.255.255.254": cidr=31;subnet_mask1="255.255.255.254";System.out.println("No Of Hosts : 0");System.out.println("No. Of Subnetworks : 2097152 (2097150)");break;
           case "255.255.255.255": cidr=32;subnet_mask1="255.255.255.255";System.out.println("No Of Hosts : 0");System.out.println("No. Of Subnetworks : 2097152 (2097150)");break;
               
           default: subnet_mask1="Invalid";
       }
        if(ip_type == "a"){
            nwID=ip1+".0.0.0"+"./"+cidr;
            System.out.println("IP RANGE : 1");
            System.out.println("Network Id & CIDR : "+nwID);
            System.out.println("Network Id : "+ip1+"."+ip2+"."+ip3+"."+ip4+"\n"+"Broadcast ID : "+ip1+"."+ip2+"."+ip3+"."+"255");

             
            if( ip_0==10 ){
               if (ip_1 <=255 && ip_2 <=255 && ip_3<=255) {
                   System.out.println("Address Type : \"Reserved\"");
               }
            }
        }
        if(ip_type == "b"){
             nwID=ip1+"."+ip2+".0.0"+"./"+cidr;
             System.out.println("IP RANGE : 2");
             System.out.println("Network Id & CIDR : "+nwID);
             System.out.println("Network Id : "+ip1+"."+ip2+"."+ip3+"."+ip4+"\n"+"Broadcast ID : "+ip1+"."+ip2+"."+"255"+"."+"255");
            if( ip_0==127 && ip_1 == 16 ){
               if (  ip_2 <=255 && ip_3<=255) {
                    System.out.println("Address Type : \"Reserved\"");
               }
            }
        }
        if(ip_type == "c"){
             nwID=ip1+"."+ip2+"."+ip3+".0"+"./"+cidr;
             System.out.println("IP RANGE : 1");
             System.out.println("Network Id & CIDR : "+nwID);
             System.out.println("Network Id : "+ip1+"."+ip2+"."+ip3+"."+ip4+"\n"+"Broadcast ID : "+ip1+"."+"255"+"."+"255"+"."+"255");
            if( ip_0==192 && ip_1 == 168 ){
               if (  ip_2 <=255 && ip_3<=255) {
                 System.out.println("Address Type : \"Reserved\"");
               }
            }
        }
        String ip0_b = Integer.toBinaryString(ip_0);
        String ip1_b = Integer.toBinaryString(ip_1);
        String ip2_b = Integer.toBinaryString(ip_2);
        String ip3_b = Integer.toBinaryString(ip_3);
        String z = "";
        String z1 = "";String z2 = "";String z3 = "";
        if(ip0_b.length() <8 ){
            for (int i=0;i<(8 - ip0_b.length());i++){
                z = z.concat("0");
            }
        }
        if(ip1_b.length() <8 ){
            for (int i=0;i<(8 - ip1_b.length());i++){
                z1 = z1.concat("0");
            }
        }
        if(ip2_b.length() <8 ){
           for (int i=0;i<(8 - ip2_b.length());i++){
                z2 = z2.concat("0");
            }
        }
        if(ip3_b.length() <8 ){
           for (int i=0;i<(8 - ip3_b.length());i++){
                z3 = z3.concat("0");
            }
        }
        String ip0 = z.concat(String.valueOf(ip0_b));
        String ip11 = z1.concat(String.valueOf(ip1_b));
        String ip22 = z2.concat(String.valueOf(ip2_b));
        String ip23 = z3.concat(String.valueOf(ip3_b));
        System.out.println("Binary Ip Address : "+ip0+"."+ip11+"."+ip22+"."+ip23);
        String[] m = subnet_mask1.split(Pattern.quote("."));
        String m11 = m[0];
        String m12 = m[1];
        String m13 = m[2];
        String m14 = m[3];
       int m111 = Integer.parseInt(m11);
       int m121 = Integer.parseInt(m12);
       int m131 = Integer.parseInt(m13);
       int m141 = Integer.parseInt(m14);
       String m1 = Integer.toBinaryString(m111);
       String m2 = Integer.toBinaryString(m121);
       String m3 = Integer.toBinaryString(m131);
       String m4 = Integer.toBinaryString(m141);
       String zm = "";
        String zm1 = "";String zm2 = "";String zm3 = "";
        if(m1.length() <8 ){
            for (int i=0;i<(8 - m1.length());i++){
                zm = zm.concat("0");
            }
        }
        if(m2.length() <8 ){
            for (int i=0;i<(8 - m2.length());i++){
                zm1 = zm1.concat("0");
            }
        }
        if(m3.length() <8 ){
           for (int i=0;i<(8 - m3.length());i++){
                zm2 = zm2.concat("0");
            }
        }
        if(m4.length() <8 ){
           for (int i=0;i<(8 - m4.length());i++){
                zm3 = zm3.concat("0");
            }
        }
        String im0 = zm.concat(String.valueOf(m1));
        String im1 = zm1.concat(String.valueOf(m2));
        String im2 = zm2.concat(String.valueOf(m3));
        String im3 = zm3.concat(String.valueOf(m4));
        System.out.println("Binary Mask "+im0+"."+im1+"."+im2+"."+im3);
        String network = nwID;
        String[] n = network.split(Pattern.quote("."));
       String n1 = n[0];
       String n2 = n[1];
       String n3 = n[2];
       String n4 = n[3];
       int n11 = Integer.parseInt(n1);
       int n12 = Integer.parseInt(n2);
       int n13 = Integer.parseInt(n3);
       int n14 = Integer.parseInt(n4); 
       String n111 = Integer.toBinaryString(n11);
       String n121 = Integer.toBinaryString(n12);
       String n131 = Integer.toBinaryString(n13);
       String n141 = Integer.toBinaryString(n14);
       String zn = "";
       String zn1 = "";String zn2 = "";String zn3 = "";
       if(n111.length() <8 ){
            for (int i=0;i<(8 - n111.length());i++){
                zn = zn.concat("0");
            }
        }
        if(n121.length() <8 ){   
            for (int i=0;i<(8 - n121.length());i++){
                zn1 = zn1.concat("0");
            }
        }
        if(n131.length() <8 ){
           for (int i=0;i<(8 - n131.length());i++){
                zn2 = zn2.concat("0");
            }
        }
        if(n141.length() <8 ){
           for (int i=0;i<(8 - n141.length());i++){
                zn3 = zn3.concat("0");
            }
        }
        String in0 = zn.concat(String.valueOf(n111));
        String in1 = zn1.concat(String.valueOf(n121));
        String in2 = zn2.concat(String.valueOf(n131));
        String in3 = zn3.concat(String.valueOf(n141));
        System.out.println("Network ID BINARY : "+in0+"."+in1+"."+in2+"."+in3);        
    }
}
