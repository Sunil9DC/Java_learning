public class Main {
    void main(String[]args) {

        System.out.println(String.format("Hello and welcome!"));

        boolean isSunny =false;
        boolean isWarm= true;
        
        if (isSunny&&isWarm){
            System.out.println("Beach Day");
        }else if(isSunny){
            System.out.println("wear jacket and then go to beach");
        }else{
            System.out.println("Stay at ghar");
        }

        }
    }
