package ExerciciosCap3.HeartBeats_Project;

//A program that calculates the maximum safe Heart Beats for a person
//And the target heart beat when doing activities
public class HeartsRates {

        //Attributes
        //Names
        private String name;
        private String surname;

        //Birthdate
        private int day;
        private int month;
        private int year;
        private int age;

        //Constructor
        public HeartsRates(){

        };

        public HeartsRates(String name, String surname, int day, int month, int year){
            this.name = name;
            this.surname = surname;

            if(day <= 31 && day > 0){
                this.day = day;
            }
            if (month <=12 && month > 0){
                this.month = month;
            }
            if(year < 10000 && year > 0){
                this.year = year;
            }
        }

        //Set methods
        public void setName(String name){
            this.name = name;
        }
        public void setSurname(String surname){
            this.surname = surname;
        }

        public void setDay(int day){
            if(day <= 31 && day > 0){
                this.day = day;
            }
        }
        public void setMonth(int month){
            if (month <=12 && month > 0){
                this.month = month;
            }
        }
        public void setYear(int year){
            if(year < 10000 && year > 0){
                this.year = year;
            }
        }

        //Get methods
        public String getName(){
            return name;
        }
        public String getSurname(){
            return surname;
        }

        public int getDay(){
            return day;
        }
        public int getMonth(){
            return month;
        }
        public int getYear(){
            return year;
        }


        //Age in years method
        public int getAge(HeartsRates object){
            int year = object.getYear();
            final int thisYear = 2026;

            this.age =  thisYear - year;

            return age;
        }

        //Heart beat methods
        public int maxHeartBeat(HeartsRates object){
            int Hmax = 220 - object.getAge(object);

            return Hmax;
        }

        public void targetHearteRate(HeartsRates object){
            int Hmax = object.maxHeartBeat(object);

            double lowHeartBeatTarget = Hmax * 0.50;
            double inteseHeartBeatTarget = Hmax * 0.80;

            System.out.println("You max heartbeat is: " + Hmax + " BPM");

            System.out.println("Your target heartbeat is: " + lowHeartBeatTarget + " for low activities "
                + "and: " + inteseHeartBeatTarget + " for intense activities.");
        }












}
