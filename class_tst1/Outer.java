package class_tst1;
/**
 * 外部类
 * 
 */

public class Outer{
    public static class Inter{
        private String  name;
        private int age;

        public Inter() {
        }

        public Inter(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age;
        }
    }
              
    
}