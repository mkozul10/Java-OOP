public class Tanki extends Dobit implements Trziste{
    String status_dobiti;
    String Ime;
    Tanki(String Ime,String status_dobiti){
        this.status_dobiti=status_dobiti;
        this.Ime=Ime;
    }
    public void dekrement(){
        for(int i=1;i<5;i++){
            if(this.status_dobiti==statusi[i])
            {
                this.status_dobiti=statusi[i-1];
            }
            
        }
    }
    public void inkrement(){
        for(int i=3;i>=0;i--){
            if(this.status_dobiti==statusi[i])
            {
                this.status_dobiti=statusi[i+1];
            }
        }
    }
    public String toString(){
        return "Tanki Ime: "+this.Ime+", status: "+this.status_dobiti;
    }
}