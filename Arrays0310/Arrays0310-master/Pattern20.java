public class Pattern20 {
    public static void main(String[] args) {
        int count = 5;
        for (int i=1; i<=count; i++){
            for (int j=0; j<=(count-i)*2; j++)       //Этим добавляем пробелы
                System.out.print(" ");               //Этим добавляем пробелы
            for (int j=1; j<=i; j++)                 //Этим вписываем цифры на увеличение
                System.out.print(j+ " ");            //Этим вписываем цифры на увеличение
            for (int j=i-1; j>=1; j--)               //Этим вписываем цифры на уменьшение
            System.out.print(j+ " ");                //Этим вписываем цифры на уменьшение
            System.out.println();                    //Этим делаем переносы по строкам
        }
    }
}
