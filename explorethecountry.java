import java.util.*;
public class explorethecountry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Explore The Country");
        System.out.println("To Explore India Press 1");
        System.out.println("To Explore Sweden Press 2");
        System.out.println("To Explore Cyprus Press 3");
        int ch=sc.nextInt();
        int ch2;
        if(ch==1)
        {
            
            System.out.println("Welcome to India");
            System.out.println("India(BhÄrat), officially the Republic of India(BhÄrat Gaá¹‡arÄjya),is a country in South Asia.");
            System.out.println("Press 1 to View Monuments");
            System.out.println("Press 2 to View 3 Famous City of India");
            System.out.println("Press 3 to Know more about Indian Heritage");
            int ch1=sc.nextInt();
            switch(ch1)
            {
                case 1:
                System.out.println(" Press 1 for Taj Mahal");
                System.out.println(" Press 2 for Sun Temple at Konark");
                System.out.println(" Press 3 for Qutab Minar");
                System.out.println(" Press 4 for Char Minar");
                ch2=sc.nextInt();
                if(ch2==1)
                {
                    System.out.println("The Taj Mahal is an ivory-white marble mausoleum in the Indian city of Agra.");
                    System.out.println("It was made by Shah Jahan in the memory of her Mumtaz Mahal");
                    System.out.println("It was declared a winner of the New 7 Wonders of the World (2000â€“2007).");
                }
                else if(ch2==2)
                {
                    System.out.println("Konark Sun Temple (Konark Surya Mandir) is a 13th-century CE(year 1250)");
                    System.out.println("The temple is attributed to king Narasimhadeva I of the Ganga Dynasty about 1250 CE");
                    System.out.println("Declared a UNESCO world heritage site in 1984");
                }
                else if(ch2==3)
                {
                    System.out.println("The Qutab Minar, is a minaret and Victory tower");
                    System.out.println("The tower tapers, and has a 14.3 metres (47 feet) base diameter");
                    System.out.println("It was built over the ruins of the Lal Kot, the citadel of Dhillika");
                }
                else if(ch2==4)
                {
                    System.out.println("The Charminar, constructed in 1591, is a monument and mosque located in Hyderabad");
                    System.out.println("The Charminar is situated on the east bank of Musi river.");
                    System.out.println("The fifth ruler of the Shahi dynasty, Muhammad Quli Qutb Shah, built the Charminar in 1591");
                }
                else
                {
                    System.out.println("Invalid");
                }
                break;
                case 2:
                System.out.println("Press 1 for Mumbai");
                System.out.println("Press 2 for Delhi");
                System.out.println("Press 3 for Haridwar");
                ch2=sc.nextInt();
                if(ch2==1)
                {
                    System.out.println("Mumbai (also known as Bombay) is the capital city of the Indian state of Maharashtra.");
                    System.out.println("Mumbai was the most populous city in India with an appox city population of 12.5 million");
                    System.out.println("Mumbai is the sixth most populous metropolitan area in the world .");
                }
                else if(ch2==2)
                {
                    System.out.println("Delhi officially known as the National Capital Territory (NCT) of Delhi");
                    System.out.println("is a city and a union territory of India containing New Delhi, the capital of India");
                    System.out.println(" is a city and a union territory of India containing New Delhi, the capital of India");
                }
                else if(ch2==3)
                {
                    System.out.println("The city is situated on the right bank of the Ganga river, at the Shivalik ranges.");
                    System.out.println("Haridwar is regarded as a holy place for Hindus,");
                    System.out.println("The Garuá¸?a PurÄ?á¹‡a states seven city as the giver of Moksh. Haridwar is said to be one them");
                }
                else
                {
                    System.out.println("Invalid");
                }
                break;
                case 3:
                System.out.println("Through the history of India,Indian culture has been heavily influenced by Dharmic religions.");
                System.out.println(" India is the birthplace of Hinduism, Buddhism, Jainism, Sikhism, and other religions");
                System.out.println(" They are collectively known as Indian religions");
                System.out.println("Indian religions are a major form of world religions along with Abrahamic ones.");
                System.out.println("Indian culture is the heritage of social norms, ethical values, traditional customs");
                System.out.println(", belief systems, political systems, artifacts and technologies.");
            }
        }
        
    }
}