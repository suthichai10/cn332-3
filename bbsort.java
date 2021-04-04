

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class bbsort {
        public void sort(person[] p,String sort) {
              person temp;
              if(sort == "firstname") {
                  for(int i = 0 ; i< p.length ; i ++) {
                      for (int j = i + 1; j < p.length; j++) {
                          if (p[i].getFirstname().compareTo(p[j].getFirstname()) > 0) {
                              temp = p[i];
                              p[i] = p[j];
                              p[j] = temp;
                          }
                      }
                  }
              }
              else if(sort == "age") {
                  for(int i = 0 ; i<p.length ; i ++) {
                      for (int j = i + 1; j < p.length; j++) {
                          if (p[i].getAge() > p[j].getAge()) {
                              temp = p[i];
                              p[i] = p[j];
                              p[j] = temp;
                          }
                      }
                  }
              }
              else if(sort == "gender") {
                  for(int i = 0 ; i <p.length ; i ++) {
                      for (int j = i + 1; j < p.length; j++) {
                          if (p[i].getGender().compareTo(p[j].getGender()) > 0) {
                              temp = p[i];
                              p[i] = p[j];
                              p[j] = temp;
                          }
                      }
                  }
              }
        }
        public String sort(String s) {
            char[] s1 = s.toCharArray();
            char temp;
            for(int i = 0 ; i<s1.length ; i ++) {
                      for (int j = i + 1; j < s1.length; j++) {
                          if (s1[i] > s1[j]) {
                              temp = s1[i];
                              s1[i] = s1[j];
                              s1[j] = temp;
                          }
                      }
                  }
            return new String(s1);
        }
}
