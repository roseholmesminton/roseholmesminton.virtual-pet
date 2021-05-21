package virtual_pet;

public class VirtualPet {
    private int min = 1;
    private int max = 4;
    private int tickRandomMessageNumber = (int) (Math.random() * max + min);
    private String petName;
    private String petBreed;
    private String userChoice = "";
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int energyLevel;

    public String getPetName() {
        return petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public VirtualPet(String petName, String petBreed, int hungerLevel, int thirstLevel, int boredomLevel, int energyLevel) {
        this.petName = petName;
        this.petBreed = petBreed;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.energyLevel = energyLevel;
    }

    public String getPetStats() {
        return getPetName() + "'s status: Hunger Level: " + getHungerLevel() + ", Thirst Level: " + getThirstLevel() + ", Boredom Level: " + getBoredomLevel() + ", Energy Level: " + getEnergyLevel();
    }

    @Override
    public String toString() {
        return getPetName() + "'s status: " + " Hunger Level: " + getHungerLevel() + ", Thirst Level: " + getThirstLevel() + ", + Boredom Level: " + getBoredomLevel() + " Energy Level: " + getEnergyLevel();
    }

    public String getUserChoice() {
        this.userChoice = userChoice;
        return userChoice;
    }

    public int getTick() {
        int min = 1;
        int max = 4;
        tickRandomMessageNumber = (int) (Math.random() * max + min);
        return tickRandomMessageNumber;
    }

    public void tick() {
        hungerLevel += 1;
        thirstLevel += 1;
        boredomLevel += 1;
        energyLevel -= 1;
    }
}


