package com.khizrpardhan.thenamesofallah;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] listOfNames = new String[100];
    String[] listOfTrans = new String[100];// not inclusive :(
    String[] listOfDesc = new String[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myListView = findViewById(R.id.myListView);// (ListView)
        setArrays();


        myListView.setAdapter(new ArrayAdapter<String>(this, R.layout.layoutresourcefile, listOfNames));
        ItemAdapter itemAdapter = new ItemAdapter(this, listOfNames, listOfTrans);
        myListView.setAdapter(itemAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, details.class);

                intent.putExtra("name", listOfNames[i]);
                intent.putExtra("trans", listOfTrans[i]);
                intent.putExtra("desc", listOfDesc[i]);
                //   finish();
                MainActivity.this.startActivity(intent);

//                TextView t = (TextView) view;
//                String str = t.getText().toString();
//                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });

/*
        Button b = new Button(this);
        b.setBackgroundColor(Color.MAGENTA);
        b.setText("play");
        b.setHeight(100);
        b.setWidth(300);
        setContentView(b);
*/
    }//onCreate

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void setArrays() {

        listOfNames[0] = "99 Names Of Allah(SWT)";
        listOfTrans[0] = " ";
        listOfDesc[0] = "Thank you for using";

        listOfNames[1] = "Ar-Rahmaan";
        listOfTrans[1] = "The Beneficent";
        listOfDesc[1] = "He who wills goodness and mercy for all His creatures";

        listOfNames[2] = "Ar-Raheem";
        listOfTrans[2] = "The Merciful";
        listOfDesc[2] = "He who acts with extreme kindness";

        listOfNames[3] = "Al-Malik	";
        listOfTrans[3] = "The Eternal Lord";
        listOfDesc[3] = "The Sovereign Lord, The One with the complete Dominion, the One Whose Dominion is clear from imperfection";

        listOfNames[4] = "Al-Quddus";
        listOfTrans[4] = "The Most Sacred";
        listOfDesc[4] = "The One who is pure from any imperfection and clear from children and adversaries";

        listOfNames[5] = "As-Salam";
        listOfTrans[5] = "The Embodiment of Peace";
        listOfDesc[5] = "The One who is free from every imperfection";

        listOfNames[6] = "Al-Mu’min";
        listOfTrans[6] = "The Infuser of Faith";
        listOfDesc[6] = "The One who witnessed for Himself that no one is God but Him. And He witnessed for His believers that they are truthful in their belief that no one is God but Him";

        listOfNames[7] = "Al-Muhaymin";
        listOfTrans[7] = "The Preserver of Safety";
        listOfDesc[7] = "The One who witnesses the saying and deeds of His creatures";

        listOfNames[8] = "Al-Aziz";
        listOfTrans[8] = "The Mighty";
        listOfDesc[8] = "The Defeater who is not defeated";

        listOfNames[9] = "Al-Jabbar";
        listOfTrans[9] = "The Omnipotent One";
        listOfDesc[9] = "The One that nothing happens in His Dominion except that which He willed";

        listOfNames[10] = "Al-Mutakabbir";
        listOfTrans[10] = "The Dominant One";
        listOfDesc[10] = "The One who is clear from the attributes of the creatures and from resembling them";

        listOfNames[11] = "Al-Khaaliq";
        listOfTrans[11] = "The Creator";
        listOfDesc[11] = "The One who brings everything from non-existence to existence";

        listOfNames[12] = "Al-Baari";
        listOfTrans[12] = "The Evolver";
        listOfDesc[12] = "The Maker, The Creator who has the Power to turn the entities";

        listOfNames[13] = "Al-Musawwir";
        listOfTrans[13] = "The Flawless Shaper";
        listOfDesc[13] = "The One who forms His creatures in different pictures";

        listOfNames[14] = "Al-Ghaffaar";
        listOfTrans[14] = "The Great Forgiver";
        listOfDesc[14] = "The Forgiver, The One who forgives the sins of His slaves time and time again";

        listOfNames[15] = "Al-Qahhaar";
        listOfTrans[15] = "The All-Prevailing One";
        listOfDesc[15] = "The Dominant, The One who has the perfect Power and is not unable over anything";

        listOfNames[16] = "Al-Wahhab";
        listOfTrans[16] = "The Supreme Bestower";
        listOfDesc[16] = "The One who is Generous in giving plenty without any return. He is everything that benefits whether Halal or Haram";

        listOfNames[17] = "Ar-Razzaq";
        listOfTrans[17] = "The Total Provider";
        listOfDesc[17] = "The Sustainer, The Provider";

        listOfNames[18] = "Al-Fattah";
        listOfTrans[18] = "The Supreme Solver";
        listOfDesc[18] = "The Opener, The Reliever, The Judge, The One who opens for His slaves the closed worldly and religious matters";

        listOfNames[19] = "Al-Alim";
        listOfTrans[19] = "The All-Knowing One";
        listOfDesc[19] = "The Knowledgeable; The One nothing is absent from His knowledge";

        listOfNames[20] = "Al-Qaabid";
        listOfTrans[20] = "The Restricting One";
        listOfDesc[20] = "The Constrictor, The Withholder, The One who constricts the sustenance by His wisdom and expands and widens it with His Generosity and Mercy";

        listOfNames[21] = "Al-Baasit";
        listOfTrans[21] = "The Extender";
        listOfDesc[21] = "The Englarger, The One who constricts the sustenance by His wisdom and expands and widens it with His Generosity and Mercy";

        listOfNames[22] = "Al-Khaafid";
        listOfTrans[22] = "The Reducer";
        listOfDesc[22] = "The Abaser, The One who lowers whoever He willed by His Destruction and raises whoever He willed by His Endowment";

        listOfNames[23] = "Ar-Rafi";
        listOfTrans[23] = "The Elevating One";
        listOfDesc[23] = "The Exalter, The Elevator, The One who lowers whoever He willed by His Destruction and raises whoever He willed by His Endowment";

        listOfNames[24] = "Al-Mu’izz";
        listOfTrans[24] = "The Honourer-Bestower";
        listOfDesc[24] = "He gives esteem to whoever He willed, hence there is no one to degrade Him; And He degrades whoever He willed, hence there is no one to give Him esteem";

        listOfNames[25] = "Al-Muzil";
        listOfTrans[25] = "The Abaser";
        listOfDesc[25] = "The Dishonourer, The Humiliator, He gives esteem to whoever He willed, hence there is no one to degrade Him; And He degrades whoever He willed, hence there is no one to give Him esteem.";

        listOfNames[26] = "As-Sami’";
        listOfTrans[26] = "The All-Hearer";
        listOfDesc[26] = "The Hearer, The One who Hears all things that are heard by His Eternal Hearing without an ear, instrument or organ";

        listOfNames[27] = "Al-Baseer";
        listOfTrans[27] = "The All-Seeing";
        listOfDesc[27] = "The All-Noticing, The One who Sees all things that are seen by His Eternal Seeing without a pupil or any other instrument";

        listOfNames[28] = "Al-Hakam";
        listOfTrans[28] = "The Impartial Judge";
        listOfDesc[28] = "The Judge, He is the Ruler and His judgment is His Word";

        listOfNames[29] = "Al-Adl";
        listOfTrans[29] = "The Embodiment of Justice";
        listOfDesc[29] = "The Just, The One who is entitled to do what He does";

        listOfNames[30] = "Al-Lateef";
        listOfTrans[30] = "The Knower of Subtleties";
        listOfDesc[30] = "The Subtle One, The Gracious, The One who is kind to His slaves and endows upon them";

        listOfNames[31] = "Al-Khabeer";
        listOfTrans[31] = "The All-Aware One";
        listOfDesc[31] = "The One who knows the truth of things";

        listOfNames[32] = "Al-Haleem";
        listOfTrans[32] = "The Clement One";
        listOfDesc[32] = "The Forebearing, The One who delays the punishment for those who deserve it and then He might forgive them";

        listOfNames[33] = "Al-Azeem";
        listOfTrans[33] = "The Magnificent One";
        listOfDesc[33] = "The Great One, The Mighty, The One deserving the attributes of Exaltment, Glory, Extolement, and Purity from all imperfection";

        listOfNames[34] = "Al-Ghafoor";
        listOfTrans[34] = "The Great Forgiver";
        listOfDesc[34] = "The All-Forgiving, The Forgiving, The One who forgives a lot";

        listOfNames[35] = "Ash-Shakoor";
        listOfTrans[35] = "The Acknowledging One";
        listOfDesc[35] = "The Grateful, The Appreciative, The One who gives a lot of reward for a little obedience";

        listOfNames[36] = "Al-Aliyy";
        listOfTrans[36] = "The Sublime One";
        listOfDesc[36] = "The Most High, The One who is clear from the attributes of the creatures";

        listOfNames[37] = "Al-Kabeer";
        listOfTrans[37] = "The Great One";
        listOfDesc[37] = "The Most Great, The Great, The One who is greater than everything in status";

        listOfNames[38] = "Al-Hafiz";
        listOfTrans[38] = "The Guarding One";
        listOfDesc[38] = "The Preserver, The Protector, The One who protects whatever and whoever He willed to protect";

        listOfNames[39] = "Al-Muqeet";
        listOfTrans[39] = "The Sustaining One";
        listOfDesc[39] = "The Maintainer, The Guardian, The Feeder, The One who has the Power";

        listOfNames[40] = "Al-Haseeb";
        listOfTrans[40] = "The Reckoning One";
        listOfDesc[40] = "The Reckoner, The One who gives the satisfaction";

        listOfNames[41] = "Al-Jaleel";
        listOfTrans[41] = "The Majestic One";
        listOfDesc[41] = "The Sublime One, The Beneficent, The One who is attributed with greatness of Power and Glory of status.";

        listOfNames[42] = "Al-Kareem";
        listOfTrans[42] = "The Bountiful One";
        listOfDesc[42] = "The Generous One, The Gracious, The One who is attributed with greatness of Power and Glory of status";

        listOfNames[43] = "Ar-Raqeeb";
        listOfTrans[43] = "The Watchful One";
        listOfDesc[43] = "The Watcher, The One that nothing is absent from Him. Hence it’s meaning is related to the attribute of Knowledge";

        listOfNames[44] = "Al-Mujeeb";
        listOfTrans[44] = "The Responding One";
        listOfDesc[44] = "The Responsive, The Hearkener, The One who answers the one in need if he asks Him and rescues the yearner if he calls upon Him";

        listOfNames[45] = "Al-Waasi’";
        listOfTrans[45] = "The All-Pervading One";
        listOfDesc[45] = "The Vast, The All-Embracing, The Knowledgeable";

        listOfNames[46] = "Al-Hakeem";
        listOfTrans[46] = "The Wise One";
        listOfDesc[46] = "The Wise, The Judge of Judges, The One who is correct in His doings";

        listOfNames[47] = "Al-Wadud";
        listOfTrans[47] = "The Loving One";
        listOfDesc[47] = "The One who loves His believing slaves and His believing slaves love Him. His love to His slaves is His Will to be merciful to them and praise them";

        listOfNames[48] = "Al-Majeed";
        listOfTrans[48] = "The Glorious One";
        listOfDesc[48] = "he Most Glorious One, The One who is with perfect Power, High Status, Compassion, Generosity and Kindness";

        listOfNames[49] = "Al-Ba’ith";
        listOfTrans[49] = "The Infuser of New Life";
        listOfDesc[49] = "The Resurrector, The Raiser (from death), The One who resurrects His slaves after death for reward and/or punishment";

        listOfNames[50] = "Ash-Shaheed";
        listOfTrans[50] = "The All Observing Witness";
        listOfDesc[50] = "The Witness, The One who nothing is absent from Him";

        listOfNames[51] = "Al-Haqq";
        listOfTrans[51] = "The Embodiment of Truth";
        listOfDesc[51] = "The Truth, The True, The One who truly exists";

        listOfNames[52] = "Al-Wakeel";
        listOfTrans[52] = "The Universal Trustee";
        listOfDesc[52] = "The Trustee, The One who gives the satisfaction and is relied upon";

        listOfNames[53] = "Al-Qawwiyy";
        listOfTrans[53] = "The Strong One";
        listOfDesc[53] = "The Most Strong, The Strong, The One with the complete Power";

        listOfNames[54] = "Al-Mateen";
        listOfTrans[54] = "The Firm One";
        listOfDesc[54] = "The One with extreme Power which is un-interrupted and He does not get tired";

        listOfNames[55] = "Al-Waliyy";
        listOfTrans[55] = "The Protecting Associate";
        listOfDesc[55] = "The Protecting Friend, The Supporter";

        listOfNames[56] = "Al-Hameed";
        listOfTrans[56] = "The Sole-Laudable One";
        listOfDesc[56] = "The Praiseworthy, The praised One who deserves to be praised";

        listOfNames[57] = "Al-Muhsee";
        listOfTrans[57] = "The All-Enumerating One";
        listOfDesc[57] = "The Counter, The Reckoner, The One who the count of things are known to him";

        listOfNames[58] = "Al-Mubdi";
        listOfTrans[58] = "The Originator";
        listOfDesc[58] = "The One who started the human being. That is, He created him";

        listOfNames[59] = "Al-Mueed";
        listOfTrans[59] = "The Restorer";
        listOfDesc[59] = "The Reproducer, The One who brings back the creatures after death";

        listOfNames[60] = "Al-Muhyi";
        listOfTrans[60] = "The Maintainer of life";
        listOfDesc[60] = "The Restorer, The Giver of Life, The One who took out a living human from semen that does not have a soul. He gives life by giving the souls"
                + " back to the worn out bodies on the resurrection day and He makes the hearts alive by the light of knowledge";

        listOfNames[61] = "Al-Mumeet";
        listOfTrans[61] = "The Inflictor of Death";
        listOfDesc[61] = "The Creator of Death, The Destroyer, The One who renders the living dead";

        listOfNames[62] = "Al-Hayy";
        listOfTrans[62] = "The Eternally Living One";
        listOfDesc[62] = "The Alive, The One attributed with a life that is unlike our life and is not that of a combination of soul, flesh or blood";

        listOfNames[63] = "Al-Qayyoom";
        listOfTrans[63] = "The Self-Subsisting One";
        listOfDesc[63] = "The One who remains and does not end";

        listOfNames[64] = "Al-Waajid";
        listOfTrans[64] = "The Pointing One";
        listOfDesc[64] = "The Perceiver, The Finder, The Rich who is never poor. Al-Wajd is Richness";

        listOfNames[65] = "Al-Maajid";
        listOfTrans[65] = "The All-Noble One";
        listOfDesc[65] = "The Glorious, He who is Most Glorious";

        listOfNames[66] = "Al-Waahid";
        listOfTrans[66] = "The Only One";
        listOfDesc[66] = "The Unique, The One, The One without a partner";

        listOfNames[67] = "Al-Ahad";
        listOfTrans[67] = "The Sole One";
        listOfDesc[67] = "The One";

        listOfNames[68] = "As-Samad";
        listOfTrans[68] = "The Supreme Provider";
        listOfDesc[68] = "The Eternal, The Independent, The Master who is relied upon in matters and reverted to in ones needs";

        listOfNames[69] = "Al-Qaadir";
        listOfTrans[69] = "The Omnipotent One";
        listOfDesc[69] = "The Able, The Capable, The One attributed with Power";

        listOfNames[70] = "Al-Muqtadir";
        listOfTrans[70] = "The All Authoritative One";
        listOfDesc[70] = "The Powerful, The Dominant, The One with the perfect Power that nothing is withheld from Him";

        listOfNames[71] = "Al-Muqaddim";
        listOfTrans[71] = "The Expediting One";
        listOfDesc[71] = "The Expediter, The Promoter, The One who puts things in their right places. He makes ahead what He wills and delays what He wills";

        listOfNames[72] = "Al-Mu’akhkhir";
        listOfTrans[72] = "The Procrastinator";
        listOfDesc[72] = "The Delayer, the Retarder, The One who puts things in their right places. He makes ahead what He wills and delays what He wills";

        listOfNames[73] = "Al-Awwal";
        listOfTrans[73] = "The Very First";
        listOfDesc[73] = "The First, The One whose Existence is without a beginning";

        listOfNames[74] = "Al-Akhir";
        listOfTrans[74] = "The Infinite Last One";
        listOfDesc[74] = "The Last, The One whose Existence is without an end";

        listOfNames[75] = "Az-Zaahir";
        listOfTrans[75] = "The Perceptible";
        listOfDesc[75] = "The Manifest, The One that nothing is above Him and nothing is underneath Him, hence He exists without a place. He, The Exalted, His Existence is obvious by proofs and He is clear from the delusions of attributes of bodies";

        listOfNames[76] = "Al-Baatin";
        listOfTrans[76] = "The Imperceptible";
        listOfDesc[76] = "The Hidden, The One that nothing is above Him and nothing is underneath Him, hence He exists without a place. He, The Exalted, His Existence is obvious by proofs and He is clear from the delusions of attributes of bodies.";

        listOfNames[77] = "Al-Waali";
        listOfTrans[77] = "The Holder of Supreme Authority";
        listOfDesc[77] = "The Governor, The One who owns things and manages them";

        listOfNames[78] = "Al-Muta’ali";
        listOfTrans[78] = "The Extremely Exalted One";
        listOfDesc[78] = "The Most Exalted, The High Exalted, The One who is clear from the attributes of the creation";

        listOfNames[79] = "Al-Barr";
        listOfTrans[79] = "The Fountain-Head of Truth";
        listOfDesc[79] = "The Source of All Goodness, The Righteous, The One who is kind to His creatures, who covered them with His sustenance and specified whoever He willed among them by His support, protection, and special mercy";

        listOfNames[80] = "At-Tawwaab";
        listOfTrans[80] = "The Ever-Acceptor of Repentance";
        listOfDesc[80] = "The Relenting, The One who grants repentance to whoever He willed among His creatures and accepts his repentance";

        listOfNames[81] = "Al-Muntaqim";
        listOfTrans[81] = "The Retaliator";
        listOfDesc[81] = "The Avenger, The One who victoriously prevails over His enemies and punishes them for their sins. It may mean the One who destroys them";

        listOfNames[82] = "Al-Afuww";
        listOfTrans[82] = "The Supreme Pardoner";
        listOfDesc[82] = "The Forgiver, The One with wide forgiveness";

        listOfNames[83] = "Ar-Ra’oof";
        listOfTrans[83] = "The Benign One";
        listOfDesc[83] = "The Compassionate, The One with extreme Mercy. The Mercy of Allah is His will to endow upon whoever He willed among His creatures";

        listOfNames[84] = "Maalik-ul-Mulk";
        listOfTrans[84] = "The Eternal Possessor of Sovereignty";
        listOfDesc[84] = "The One who controls the Dominion and gives dominion to whoever He willed";

        listOfNames[85] = "Zul-Jalaali-wal-Ikram";
        listOfTrans[85] = "The Possessor of Majesty and Honour";
        listOfDesc[85] = "The Lord of Majesty and Bounty, The One who deserves to be Exalted and not denied";

        listOfNames[86] = "Al-Muqsit";
        listOfTrans[86] = "The Just One";
        listOfDesc[86] = "The Equitable, The One who is Just in His judgment";

        listOfNames[87] = "Al-Jaami’";
        listOfTrans[87] = "The Assembler of Scattered Creations";
        listOfDesc[87] = "The Gatherer, The One who gathers the creatures on a day that there is no doubt about, that is the Day of Judgment";

        listOfNames[88] = "Al-Ghaniyy";
        listOfTrans[88] = "The Self-Sufficient one";
        listOfDesc[88] = "The One who does not need the creation";

        listOfNames[89] = "Al-Mughni";
        listOfTrans[89] = "The Bestower of Sufficiency";
        listOfDesc[89] = "The Enricher, The One who satisfies the necessities of the creatures";

        listOfNames[90] = "Al-Maani’";
        listOfTrans[90] = "The Preventer";
        listOfDesc[90] = "The Withholder";

        listOfNames[91] = "Ad-Daarr";
        listOfTrans[91] = "The Distressor";
        listOfDesc[91] = "The One who makes harm reach to whoever He willed and benefit to whoever He willed";

        listOfNames[92] = "An-Naafi’";
        listOfTrans[92] = "The Bestower of Benefits";
        listOfDesc[92] = "The Propitious, The One who makes harm reach to whoever He willed and benefit to whoever He willed";

        listOfNames[93] = "An-Noor";
        listOfTrans[93] = "The Prime Light";
        listOfDesc[93] = "The Light, The One who guides";

        listOfNames[94] = "Al-Haadi";
        listOfTrans[94] = "The Provider of Guidance";
        listOfDesc[94] = "The Guide, The One whom with His Guidance His believers were guided, and with His Guidance the living beings have been guided to what is beneficial for them and protected from what	is harmful to them";

        listOfNames[95] = "Al-Badi’";
        listOfTrans[95] = "The Unique One";
        listOfDesc[95] = "The Incomparable, The One who created the creation and formed it without any preceding example";

        listOfNames[96] = "Al-Baaqi";
        listOfTrans[96] = "The Ever Surviving One";
        listOfDesc[96] = "The Everlasting, The One that the state of non-existence is impossible for Him";

        listOfNames[97] = "Al-Waaris";
        listOfTrans[97] = "The Eternal Inheritor";
        listOfDesc[97] = "The Heir, The One whose Existence remains";

        listOfNames[98] = "Ar-Rasheed";
        listOfTrans[98] = "The Guide to Path of Rectitude";
        listOfDesc[98] = "The Guide to the Right Path, The One who guides";

        listOfNames[99] = "As-Saboor";
        listOfTrans[99] = "The Extensively Enduring One";
        listOfDesc[99] = "The Patient, The One who does not quickly punish the sinners";
    }//setArrays

}//main
