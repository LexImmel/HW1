public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog is " + dog);
        System.out.println("cat is " + cat);
        System.out.println("paper is" + paper);
        var fatDog = dog+4;
        System.out.println("Bigger dog is " + fatDog);
        var fatCat = cat+4;
        System.out.println("Bigger cat is " + fatCat);
        var fatPaper = paper+4;
        System.out.println("Bigger paper is " + fatPaper);
        var smolDog = dog-3.5;
        System.out.println("Smaller dog is " + smolDog);
        var smolCat = cat-1.6;
        System.out.println("Smaller cat is " + smolCat);
        var smolPaper = paper-7639;
        System.out.println("Smaller paper is " + smolPaper);
        var friend = 19;
        System.out.println("Friend is " + friend);
        friend = friend+2;
        System.out.println("Friend is " + friend);
        friend = friend/7;
        System.out.println("Friend is " + friend);
        var frog = 3.5;
        System.out.println("Frog is " + frog);
        var bigFrog = frog *10;
        System.out.println("Big Frog is " + bigFrog);
        var biggestFrog = bigFrog /3.5;
        System.out.println("Biggest Frog is " + biggestFrog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var massSum = boxer1 + boxer2;
        System.out.println("Sum of masses : " + massSum);
        var massDiff = boxer1 - boxer2;
        System.out.println("Diff in masses: " + massDiff);
        var boxersDiff = boxer2 % boxer1;
        System.out.println("Diff of boxers : " + boxersDiff);
        var workHours = 640;
        var oneWorkerDay = 8;
        var numberOfWorkers = workHours/oneWorkerDay;
        System.out.println("Number of workers in company: " + numberOfWorkers);
        var optNumberOfWorkers = numberOfWorkers+94;
        var optWorkHours = optNumberOfWorkers*8;
        System.out.print("If there are " + optNumberOfWorkers + " workers in company, there is " + optWorkHours + " hours to share");
        }
    }