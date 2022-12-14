package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

     Offer offer1=new Offer();
     offer1.setInfo("VA","Amazon","SDET",110000,true,true,true,true);

     Offer offer2=new Offer();
     offer2.setInfo("CA","Sony","QA",120000,true,false,false,true);

     Offer offer3=new Offer();
     offer3.setInfo("FL","Apple","QE",125000,true,true,true,false);

     Offer offer4=new Offer();
     offer4.setInfo("TX","CapitalOne","SM",115000,false,false,true,true);

     Offer offer5=new Offer();
     offer5.setInfo("WA","Bank Of America","BA",130000,true,true,false,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        System.out.println("-------------------------------------------------------------");


    Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println("fullTimeOffers = " + fullTimeOffers.size());//4


        ArrayList<Offer> localOffers= new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !(p.location.equals("VA") || p.location.equals("CA")));

        System.out.println("localOffers = " + localOffers.size());//2

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+ " : " + localOffer.salary);
        }


        ArrayList<Offer> offersWithBenefits= new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> !(p.hasBenefit && p.hasPTO));

        System.out.println("offersWithBenefits.size() = " + offersWithBenefits.size());//3

        ArrayList<Offer> sdetOffers= new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));

        System.out.println("sdetOffers = " + sdetOffers.size());//1

        ArrayList<Offer> offersWith100K= new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p-> p.salary<120000);

        System.out.println("offersWith100K = " + offersWith100K.size());//3




  /*
  2. Create a class named MyOffers:

2.1 Create 7 objects of Offer
2.2 Create an array of Offers named myOffers and store all 7 objects of offers
2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
2.3.1 Write a program that can remove the offer objects that are not full-time
2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
2.4.1 Write a program that can remove all the offers that are not from local
2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
2.5.1 Write a program that can remove all the offers that does not have
						benefit and does not have PTO
2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
2.6.1 Write a program that can remove all the offers that are not for SDET
2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
   */








    }
}
