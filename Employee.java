public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if(this.salary<1000){
          return salary;
        }
        else{
            double tax = salary*(0.03);
            return tax;

        }
    }

    public int bonus(){
        if(this.workHours<40){
           return workHours;
        }
        else{
            int bonus = (workHours-40)*30;
            return bonus;
        }

    }
    public double raiseSalary(){

        double maasArtis;


        if((2021-this.hireYear) > 10){
            maasArtis = salary*(0.05);
            return maasArtis;
        }
        else if((2021-this.hireYear)>9 && (2021-hireYear)<20){
            maasArtis = salary*(0.10);
            return maasArtis;

        }
        else if((2021-this.hireYear)>19){
            maasArtis = salary*(0.15);
            return maasArtis;

        }
        return 0;

    }
    public String toString(){

        double total = salary -tax()+bonus()+raiseSalary();
        double tot = salary +bonus()-tax();

        System.out.println("adı: "+this.name);
        System.out.println("maaşı: "+this.salary);
        System.out.println("çalışma saati: "+this.workHours);
        System.out.println("başlangıc yılı: "+this.hireYear);
        System.out.println("vergi :"+tax());
        System.out.println("bonus: "+bonus());
        System.out.println("maaş artışı: "+raiseSalary());
        System.out.println("vergi ve bonuslarla beraber maaş: "+tot);
        System.out.println("toplam maaaş: "+total);

        return null;

    }

}
