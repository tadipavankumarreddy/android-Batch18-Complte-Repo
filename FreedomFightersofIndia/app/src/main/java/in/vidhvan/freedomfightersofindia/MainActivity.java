package in.vidhvan.freedomfightersofindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<FreedomFighters> fighters;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        createData();

        FreedomAdapter adapter = new FreedomAdapter(this,fighters);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
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

        //balagangadhar tilak
        FreedomFighters tilak = new FreedomFighters("Bala Gangadhar Tilak", "1856-1920","Keshav Gangadhar Tilak was born on 23 July 1856 in an Marathi Hindu Chitpavan Brahmin family in Ratnagiri, the headquarters of the Ratnagiri district of present-day Maharashtra (then Bombay Presidency).[1] His ancestral village was Chikhali. His father, Gangadhar Tilak was a school teacher and a Sanskrit scholar who died when Tilak was sixteen. In 1871, Tilak was married to Tapibai (Née Bal) when he was sixteen, a few months before his father's death. After marriage, her name was changed to Satyabhamabai. He obtained his Bachelor of Arts in first class in Mathematics from Deccan College of Pune in 1877. ", R.drawable.tilak);
        fighters.add(tilak);

        FreedomFighters pandey = new FreedomFighters("Mangal Pandey","1827-1857","On the afternoon of 29 March 1857, Lieutenant Baugh, Adjutant of the 34th Bengal Native Infantry, then stationed at Barrackpore was informed that several men of his regiment were in an excited state. Further, it was reported to him that one of them, Mangal Pandey, was pacing in front of the regiment's guard room by the parade ground, armed with a loaded musket, calling upon the men to rebel and threatening to shoot the first European that he set eyes on. Testimony at a subsequent enquiry recorded that Pandey, unsettled by unrest amongst the sepoys and intoxicated by the narcotic bhang, had seized his weapons and run to the quarter-guard building upon learning that a detachment of British soldiers was disembarking from a steamer near the cantonment.", R.drawable.pandey);
        fighters.add(pandey);

        FreedomFighters jhansi = new FreedomFighters("Rani Lakshmibai","1828-1858","Rani Lakshmibai (or Rani Lakshmi Bai) was born on 19 November 1828[3][4] (some sources say 1835)[2][5][6] in the town of Benares (now Varanasi) into a Marathi Karhade Brahmin family.[7] She was named Manikarnika Tambe and was nicknamed Manu.[8] Her father was Moropant Tambe[9] and her mother Bhagirathi Sapre (Bhagirathi Bai). Her parents came from the Tambe village of the Guhagar taluka located in the Ratnagiri district of Maharashtra.[10] Her mother died when she was four years old. Her father was the Commander of the war of Kalyanpranth. Her father worked for Peshwa Baji Rao II of Bithoor district.[11] The Peshwa called her \"Chhabili\", which means \"beautiful \" and \"lively and cheerful\". She was educated at home and was taught to read and write, and was more independent in her childhood than others of her age; her studies included shooting, horsemanship, fencing[12][13] and mallakhamba with her childhood friends Nana Sahib and Tantia Tope.", R.drawable.jhansi);
        fighters.add(jhansi);
    }


    // TODO 1: Prepare Data
    // TODO 2: Create a layout file that defines how you want to display each item on the recyclerview
    // TODO 3: Add the Recyclerview to the project
    // TODO 4: Create an Adapter (along with a ViewHolder)
    // TODO 5: add the adapter and layout manager on Recyclerview
}