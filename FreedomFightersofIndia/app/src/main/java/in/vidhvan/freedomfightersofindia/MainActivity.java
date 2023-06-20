package in.vidhvan.freedomfightersofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<FreedomFighters> fighters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createData();
    }

    private void createData() {
        fighters = new ArrayList<>();

        //gandhi
        FreedomFighters gandhi = new FreedomFighters("MK Gandhi","1869-1948","Born and raised in a Hindu family in coastal Gujarat, Gandhi trained in the law at the Inner Temple, London, and was called to the bar at age 22 in June 1891. After two uncertain years in India, where he was unable to start a successful law practice, he moved to South Africa in 1893 to represent an Indian merchant in a lawsuit. He went on to live in South Africa for 21 years. It was here that Gandhi raised a family and first employed nonviolent resistance in a campaign for civil rights. In 1915, aged 45, he returned to India and soon set about organising peasants, farmers, and urban labourers to protest against excessive land-tax and discrimination.",R.drawable.gandhi);
        fighters.add(gandhi);

        //Bose
        FreedomFighters bose = new FreedomFighters("Subhas Chandra Bose", "1897-1945","Subhas Bose was born into wealth and privilege in a large Bengali family in Orissa during the British Raj. The early recipient of an Anglocentric education, he was sent after college to England to take the Indian Civil Service examination. He succeeded with distinction in the vital first exam but demurred at taking the routine final exam, citing nationalism to be a higher calling. Returning to India in 1921, Bose joined the nationalist movement led by Mahatma Gandhi and the Indian National Congress.",R.drawable.bose);
        fighters.add(bose);

        //Bhagat
        FreedomFighters bhagat = new FreedomFighters("Bhagat Singh", "1907-1931","In December 1928, Bhagat Singh and an associate, Shivaram Rajguru, both members of a small revolutionary group, the Hindustan Socialist Republican Association (also Army, or HSRA), shot dead a 21-year-old British police officer, John Saunders, in Lahore, Punjab, in what is today Pakistan, mistaking Saunders, who was still on probation, for the British senior police superintendent, James Scott, whom they had intended to assassinate.", R.drawable.bhagat);
        fighters.add(bhagat);

        // Chandra Shekar Azad
        FreedomFighters azad = new FreedomFighters("Chandra Shekar Azad", "1906-1931","After the suspension of the non-cooperation movement in 1922 by Mahatma Gandhi, Azad became disappointed. He met a young revolutionary, Manmath Nath Gupta, who introduced him to Ram Prasad Bismil who had formed the Hindustan Republican Association (HRA), a revolutionary organization. He then became an active member of the HRA and started to collect funds for HRA. Most of the fund collection was through robberies of government property.", R.drawable.chandrashekar);
        fighters.add(azad);

         // Nehru
        FreedomFighters nehru = new FreedomFighters("Jawaharlal Nehru", "1889-1964", "The son of Motilal Nehru, a prominent lawyer and Indian nationalist, Jawaharlal Nehru was educated in England—at Harrow School and Trinity College, Cambridge, and trained in the law at the Inner Temple. He became a barrister, returned to India, enrolled at the Allahabad High Court and gradually began to take an interest in national politics, which eventually became a full-time occupation. He joined the Indian National Congress, rose to become the leader of a progressive faction during the 1920s, and eventually of the Congress, receiving the support of Mahatma Gandhi who was to designate Nehru as his political heir.", R.drawable.nehru);
        fighters.add(nehru);
    }

    // TODO 1: Prepare Data
}