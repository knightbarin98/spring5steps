package com.mrbarin.mockito;


//Example of class that needs a dependency in order to work
//Making it harder to test because we need to generate multiple stub of the dependency
public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData(){
        int [] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int value: data){
            if(value > greatest){
                greatest = value;
            }
        }

        return greatest;
    }
}

