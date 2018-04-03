import sun.org.mozilla.javascript.internal.regexp.SubString;

public class Main {

    public class student {
        public String name, ename, department, email, phone, address, id;
        public int hight, weight;

        public student(String name1, String ename1, String department1, String email1, String phone1, String address1, String id1, int hight1, int weight1) {
            this.setName(name1);
            this.setEname(ename1);
            this.setDepartment(department1);
            this.setEmail(email1);
            this.setPhone(phone1);
            this.setAddress(address1);
            this.setId(id1);
            this.setHight(hight1);
            this.setWeight(weight1);
        }

        public void setName(String name1) {
            if (name1.matches("[0-9]{9}")) {
                System.out.println("correct");
            }else {
                System.out.println("re-enter");
            }
            this.name = name1;
        }

        public String getName() {
            return name;
        }

        public void setEname(String ename1) {
            if (ename1.matches("[0-15]{15}")) {
                System.out.println("correct");
            }else {
                System.out.println("re-enter");
            }
            this.ename = ename1;
        }

        public String getEname() {
            return ename;
        }

        public void setDepartment(String department1) {
            this.department = department1;
        }

        public String getDepartment() {
            return department;
        }

        public void setEmail(String email1) {
            this.email = email1;
        }

        public String getEmail() {
            return email;
        }

        public void setPhone(String phone1) {
            if (phone1.matches("[0-9]{9}")) {
                System.out.println("correct");
            }else {
                System.out.println("re-enter");
            }
            this.phone = phone1;
        }

        public String getPhone() {
            return phone;
        }

        public void setAddress(String address1) {
            this.address = address1;
        }

        public String getAddress() {
            return address;
        }

        public void setId(String id1) {
            if (id1.matches("[0-9]{9}")) {
                System.out.println("correct");
            }else {
                System.out.println("re-enter");
            }
            this.id = id1;
        }

        public String getId() {
            return id;
        }

        public void setHight(int hight1) {
            this.hight = hight1;
        }

        public int getHight() {
            return hight;
        }
        public void setWeight(int weight1){
            this.weight=weight1;
        }
        public int getWeight(){
            return  weight;
        }
    }
}