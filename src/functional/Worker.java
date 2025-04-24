package functional;
 interface Worker {
     String doWork();

     default void report() {
            System.out.println("Reporting from Worker: " + doWork());
     }
}
class WorkDemo {
        public static void main(String[] args) {
            Worker worker = () -> "Work is done!";
            worker.report();
        }
}