public class Training {
    private int number_of_pushups;
    private int number_of_squat;
    private int number_of_situps;
    private int number_of_burpee;

    public Training(int number_of_burpee,int number_of_pushups,int number_of_situps,int number_of_squat) {
        this.number_of_burpee = number_of_burpee;
        this.number_of_pushups=number_of_pushups;
        this.number_of_situps=number_of_situps;
        this.number_of_squat=number_of_squat;
    }

    public int getNumber_of_burpee() {
        return number_of_burpee;
    }

    public void setNumber_of_burpee(int number_of_burpee) {
        this.number_of_burpee = number_of_burpee;
    }

    public int getNumber_of_pushups() {
        return number_of_pushups;
    }

    public void setNumber_of_pushups(int number_of_pushups) {
        this.number_of_pushups = number_of_pushups;
    }

    public int getNumber_of_situps() {
        return number_of_situps;
    }

    public void setNumber_of_situps(int number_of_situps) {
        this.number_of_situps = number_of_situps;
    }

    public int getNumber_of_squat() {
        return number_of_squat;
    }

    public void setNumber_of_squat(int number_of_squat) {
        this.number_of_squat = number_of_squat;
    }

    public void move(String moveSSet,int num){
        if(moveSSet.equals("burpee")){
            doBurpee(num);

        }
        else if(moveSSet.equals("pushup")){
                doPushup(num);
        }
        else if(moveSSet.equals("situp")){
              doSitup(num);
        }
        else if(moveSSet.equals("squat")){
               doSquat(num);
        }
        else{
            System.out.println("invalid ");
        }
    }

    public void doBurpee(int num){
        if(number_of_burpee==0){
            System.out.println("no burpee left to do");
        }
        else if(num>number_of_burpee){
            System.out.println("you passed the limit. congrats!");
            number_of_burpee=0;
            System.out.println("number of burpee you did " + num);
        }

        else{
            number_of_burpee-=num;
            System.out.println("Number of burpee yoo need to do is " + number_of_burpee);
        }
    }

    public void doSitup(int num){
        if(number_of_situps==0){
            System.out.println("no situp left to do");
        }
        else if(num>number_of_situps){
            System.out.println("you passed the limit. congrats!");
            number_of_situps=0;
            System.out.println("number of situp you did " + num);
        }

        else{
            number_of_situps-=num;
            System.out.println("Number of situp yoo need to do is " + number_of_situps);
        }
    }
    public void doSquat(int num){
        if(number_of_squat==0){
            System.out.println("no squat left to do");
        }
        else if(num>number_of_squat){
            System.out.println("you passed the limit. congrats!");
            number_of_squat=0;
            System.out.println("number of squat you did " + num);
        }

        else{
            number_of_squat-=num;
            System.out.println("Number of squat yoo need to do is " + number_of_squat);
        }
    }

    public void doPushup(int num){
        if(number_of_pushups==0){
            System.out.println("no pushup left to do");
        }
        else if(num>number_of_pushups){
            System.out.println("you passed the limit. congrats!");
            number_of_pushups=0;
            System.out.println("number of pushup you did " + num);
        }

        else{
            number_of_pushups-=num;
            System.out.println("Number of pushup yoo need to do is " + number_of_pushups);
        }
    }

    public boolean isOver(){
        return (number_of_burpee==0)&& (number_of_situps==0) && (number_of_squat==0)&&(number_of_pushups==0);
    }
}
