package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet("Sweet Pea", "Russian Dwarf Hamster", 28, 28, 2, 2);

    @Test
    public void shouldReturnSweetPea() {
        String actualPetName = underTest.getPetName();
        assertThat(actualPetName, is("Sweet Pea"));
    }

    @Test
    public void shouldReturnRussianDwarfHamster() {
        String actualPetBreed = underTest.getPetBreed();
        assertThat(actualPetBreed, is("Russian Dwarf Hamster"));
    }

    @Test
    public void shouldReturn28HungerLevel() {
        int actualHungerLevel = underTest.getHungerLevel();
        assertThat(actualHungerLevel, is(28));
    }

    @Test
    public void shouldReturn28ThirstLevel() {
        int actualThirstLevel = underTest.getThirstLevel();
        assertThat(actualThirstLevel, is(28));
    }

    @Test
    public void shouldReturn28EnergyLevel() {
        int actualEnergyLevel = underTest.getEnergyLevel();
        assertThat(actualEnergyLevel, is(28));
    }

    @Test
    public void shouldReturnBoredomLevel() {
        int actualBoredomLevel = underTest.getBoredomLevel();
        assertThat(actualBoredomLevel, is(28));
    }

    @Test
    public void shouldReturnTheOverrideOutput() {
        String petStatus = underTest.getPetStats();
        assertThat(petStatus, is("Sweet Pea's status: Hunger Level: 28, Thirst Level: 28, Boredom Level: 2, Energy Level: 2"));
    }

    @Test
    public void shouldReturn1() {
        String userChoice = underTest.getUserChoice();
        assertThat(userChoice, is(""));
    }
    
    @Test
    public void shouldReturn28() {
        int hungerLevel = underTest.getHungerLevel();
        assertThat(hungerLevel, is(28));
    }
}

