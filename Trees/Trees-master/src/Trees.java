import java.security.cert.Extension;

public class Trees {

        public static void main(String[] args) {
            Tree fir = new Conifer();
            fir.printInfo(Season.SPRING);
            Tree apple = new Deciduous();
            apple.printInfo(Season.WINTER);
        }
    }
    enum Season {WINTER, SPRING, SUMMER, AUTUMN}

    abstract class Tree {
         void printInfo(Season season){
            System.out.println(season + ":");
        }
    }

    class Conifer extends Tree{
         void printInfo(Season season){
            super.printInfo(season);

                 switch (season){
                     case WINTER:
                         System.out.println("The tree stays green");
                         break;
                     case SPRING:
                         System.out.println("The tree blooms");
                         break;
                     case SUMMER:
                         System.out.println("The tree grows quickly");
                         break;
                     case AUTUMN:
                         System.out.println("The tree grows slowly");
                         break;
                 }
             }
    }

    class Deciduous extends Tree {
        void printInfo(Season season) {
            super.printInfo(season);
            switch (season){
                case WINTER:
                    System.out.println("The tree is naked");
                    break;
                case SPRING:
                    System.out.println("The tree blooms");
                    break;
                case SUMMER:
                    System.out.println("The tree grows very quickly");
                    break;
                case AUTUMN:
                    System.out.println("The tree sheds leaves");
                    break;
            }
        }
    }

