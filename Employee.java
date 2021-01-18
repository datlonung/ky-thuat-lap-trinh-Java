public class Employee {
        private String name; //biến toàn cục

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Employee bkitEmployee = new Employee("Huy Nguyen");
            System.out.println("Tên: " + bkitEmployee.getName());
        }
    }



