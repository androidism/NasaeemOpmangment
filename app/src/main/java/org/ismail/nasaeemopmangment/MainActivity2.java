package org.ismail.nasaeemopmangment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity2 extends AppCompatActivity {
    public boolean isAppRunning = true;

    public void setIsAppRunning(boolean v){
        isAppRunning = v;
    }

    public boolean isAppRunning(){
        return isAppRunning;
    }
    FloatingActionButton add_task, edit_task;
    ExtendedFloatingActionButton fab;
    TextView ta_add, ta_edit;
TextView name1,point1,target1,team1,location1,Section1,
    name2,point2,target2,team2,location2,Section2,
    name3,point3,target3,team3,location3,Section3,  name4,point4,target4,team4,location4,Section4,date1, date2,date3,date4,    name5,	point5,	target5,	team5,	location5,	Section5,	date5,	name6,	point6,	target6,	team6,	location6,	Section6,	date6,	name7,	point7,	target7,	team7,	location7,	Section7,	date7,	name8,	point8,	target8,	team8,	location8,	Section8,	date8,	name9,	point9,	target9,	team9,	location9,	Section9,	date9,	name10,	point10,	target10,	team10,	location10,	Section10,	date10,	name11,	point11,	target11,	team11,	location11,	Section11,	date11,	name12,	point12,	target12,	team12,	location12,	Section12,	date12,	name13,	point13,	target13,	team13,	location13,	Section13,	date13,	name14,	point14,	target14,	team14,	location14,	Section14,	date14,	name15,	point15,	target15,	team15,	location15,	Section15,	date15,	name16,	point16,	target16,	team16,	location16,	Section16,	date16,	name17,	point17,	target17,	team17,	location17,	Section17,	date17,	name18,	point18,	target18,	team18,	location18,	Section18,	date18,	name19,	point19,	target19,	team19,	location19,	Section19,	date19,	name20,	point20,	target20,	team20,	location20,	Section20,	date20,	name21,	point21,	target21,	team21,	location21,	Section21,	date21,	name22,	point22,	target22,	team22,	location22,	Section22,	date22,	name23,	point23,	target23,	team23,	location23,	Section23,	date23,	name24,	point24,	target24,	team24,	location24,	Section24,	date24,	name25,	point25,	target25,	team25,	location25,	Section25,	date25,	name26,	point26,	target26,	team26,	location26,	Section26,	date26,	name27,	point27,	target27,	team27,	location27,	Section27,	date27,	name28,	point28,	target28,	team28,	location28,	Section28,	date28,	name29,	point29,	target29,	team29,	location29,	Section29,	date29,	name30,	point30,	target30,	team30,	location30,	Section30,	date30,	name31,	point31,	target31,	team31,	location31,	Section31,	date31,	name32,	point32,	target32,	team32,	location32,	Section32,	date32,	name33,	point33,	target33,	team33,	location33,	Section33,	date33,	name34,	point34,	target34,	team34,	location34,	Section34,	date34,	name35,	point35,	target35,	team35,	location35,	Section35,	date35,	name36,	point36,	target36,	team36,	location36,	Section36,	date36,	name37,	point37,	target37,	team37,	location37,	Section37,	date37,	name38,	point38,	target38,	team38,	location38,	Section38,	date38,	name39,	point39,	target39,	team39,	location39,	Section39,	date39,	name40,	point40,	target40,	team40,	location40,	Section40,	date40,	name41,	point41,	target41,	team41,	location41,	Section41,	date41,	name42,	point42,	target42,	team42,	location42,	Section42,	date42,	name43,	point43,	target43,	team43,	location43,	Section43,	date43,	name44,	point44,	target44,	team44,	location44,	Section44,	date44,	name45,	point45,	target45,	team45,	location45,	Section45,	date45,	name46,	point46,	target46,	team46,	location46,	Section46,	date46,	name47,	point47,	target47,	team47,	location47,	Section47,	date47,	name48,	point48,	target48,	team48,	location48,	Section48,	date48,	name49,	point49,	target49,	team49,	location49,	Section49,	date49,	name50,	point50,	target50,	team50,	location50,	Section50,	date50,	name51,	point51,	target51,	team51,	location51,	Section51,	date51,	name52,	point52,	target52,	team52,	location52,	Section52,	date52,	name53,	point53,	target53,	team53,	location53,	Section53,	date53,	name54,	point54,	target54,	team54,	location54,	Section54,	date54,	name55,	point55,	target55,	team55,	location55,	Section55,	date55,	name56,	point56,	target56,	team56,	location56,	Section56,	date56,	name57,	point57,	target57,	team57,	location57,	Section57,	date57,	name58,	point58,	target58,	team58,	location58,	Section58,	date58,	name59,	point59,	target59,	team59,	location59,	Section59,	date59,	name60,	point60,	target60,	team60,	location60,	Section60,	date60,	name61,	point61,	target61,	team61,	location61,	Section61,	date61,	name62,	point62,	target62,	team62,	location62,	Section62,	date62,	name63,	point63,	target63,	team63,	location63,	Section63,	date63,	name64,	point64,	target64,	team64,	location64,	Section64,	date64,	name65,	point65,	target65,	team65,	location65,	Section65,	date65,	name66,	point66,	target66,	team66,	location66,	Section66,	date66,	name67,	point67,	target67,	team67,	location67,	Section67,	date67,	name68,	point68,	target68,	team68,	location68,	Section68,	date68,	name69,	point69,	target69,	team69,	location69,	Section69,	date69,	name70,	point70,	target70,	team70,	location70,	Section70,	date70,	name71,	point71,	target71,	team71,	location71,	Section71,	date71,	name72,	point72,	target72,	team72,	location72,	Section72,	date72,	name73,	point73,	target73,	team73,	location73,	Section73,	date73,	name74,	point74,	target74,	team74,	location74,	Section74,	date74,	name75,	point75,	target75,	team75,	location75,	Section75,	date75,	name76,	point76,	target76,	team76,	location76,	Section76,	date76,	name77,	point77,	target77,	team77,	location77,	Section77,	date77,	name78,	point78,	target78,	team78,	location78,	Section78,	date78,	name79,	point79,	target79,	team79,	location79,	Section79,	date79,	name80,	point80,	target80,	team80,	location80,	Section80,	date80,	name81,	point81,	target81,	team81,	location81,	Section81,	date81,	name82,	point82,	target82,	team82,	location82,	Section82,	date82,	name83,	point83,	target83,	team83,	location83,	Section83,	date83,	name84,	point84,	target84,	team84,	location84,	Section84,	date84,	name85,	point85,	target85,	team85,	location85,	Section85,	date85,	name86,	point86,	target86,	team86,	location86,	Section86,	date86,	name87,	point87,	target87,	team87,	location87,	Section87,	date87,	name88,	point88,	target88,	team88,	location88,	Section88,	date88,	name89,	point89,	target89,	team89,	location89,	Section89,	date89,	name90,	point90,	target90,	team90,	location90,	Section90,	date90,	name91,	point91,	target91,	team91,	location91,	Section91,	date91,	name92,	point92,	target92,	team92,	location92,	Section92,	date92,	name93,	point93,	target93,	team93,	location93,	Section93,	date93,	name94,	point94,	target94,	team94,	location94,	Section94,	date94,	name95,	point95,	target95,	team95,	location95,	Section95,	date95,	name96,	point96,	target96,	team96,	location96,	Section96,	date96,	name97,	point97,	target97,	team97,	location97,	Section97,	date97,	name98,	point98,	target98,	team98,	location98,	Section98,	date98,	name99,	point99,	target99,	team99,	location99,	Section99,	date99,	name100,	point100,	target100,	team100,	location100,	Section100,	date100,	name101,	point101,	target101,	team101,	location101,	Section101,	date101,	name102,	point102,	target102,	team102,	location102,	Section102,	date102,	name103,	point103,	target103,	team103,	location103,	Section103,	date103,	name104,	point104,	target104,	team104,	location104,	Section104,	date104,	name105,	point105,	target105,	team105,	location105,	Section105,	date105,	name106,	point106,	target106,	team106,	location106,	Section106,	date106,	name107,	point107,	target107,	team107,	location107,	Section107,	date107,	name108,	point108,	target108,	team108,	location108,	Section108,	date108,	name109,	point109,	target109,	team109,	location109,	Section109,	date109,	name110,	point110,	target110,	team110,	location110,	Section110,	date110,	name111,	point111,	target111,	team111,	location111,	Section111,	date111,	name112,	point112,	target112,	team112,	location112,	Section112,	date112,	name113,	point113,	target113,	team113,	location113,	Section113,	date113,	name114,	point114,	target114,	team114,	location114,	Section114,	date114,	name115,	point115,	target115,	team115,	location115,	Section115,	date115,	name116,	point116,	target116,	team116,	location116,	Section116,	date116,	name117,	point117,	target117,	team117,	location117,	Section117,	date117,	name118,	point118,	target118,	team118,	location118,	Section118,	date118,	name119,	point119,	target119,	team119,	location119,	Section119,	date119,	name120,	point120,	target120,	team120,	location120,	Section120,	date120,	name121,	point121,	target121,	team121,	location121,	Section121,	date121,	name122,	point122,	target122,	team122,	location122,	Section122,	date122,	name123,	point123,	target123,	team123,	location123,	Section123,	date123,	name124,	point124,	target124,	team124,	location124,	Section124,	date124,	name125,	point125,	target125,	team125,	location125,	Section125,	date125,	name126,	point126,	target126,	team126,	location126,	Section126,	date126,	name127,	point127,	target127,	team127,	location127,	Section127,	date127,	name128,	point128,	target128,	team128,	location128,	Section128,	date128,	name129,	point129,	target129,	team129,	location129,	Section129,	date129,	name130,	point130,	target130,	team130,	location130,	Section130,	date130,	name131,	point131,	target131,	team131,	location131,	Section131,	date131,	name132,	point132,	target132,	team132,	location132,	Section132,	date132,	name133,	point133,	target133,	team133,	location133,	Section133,	date133,	name134,	point134,	target134,	team134,	location134,	Section134,	date134,	name135,	point135,	target135,	team135,	location135,	Section135,	date135,	name136,	point136,	target136,	team136,	location136,	Section136,	date136,	name137,	point137,	target137,	team137,	location137,	Section137,	date137,	name138,	point138,	target138,	team138,	location138,	Section138,	date138,	name139,	point139,	target139,	team139,	location139,	Section139,	date139,	name140,	point140,	target140,	team140,	location140,	Section140,	date140,	name141,	point141,	target141,	team141,	location141,	Section141,	date141,	name142,	point142,	target142,	team142,	location142,	Section142,	date142,	name143,	point143,	target143,	team143,	location143,	Section143,	date143,	name144,	point144,	target144,	team144,	location144,	Section144,	date144,	name145,	point145,	target145,	team145,	location145,	Section145,	date145,	name146,	point146,	target146,	team146,	location146,	Section146,	date146,	name147,	point147,	target147,	team147,	location147,	Section147,	date147,	name148,	point148,	target148,	team148,	location148,	Section148,	date148,	name149,	point149,	target149,	team149,	location149,	Section149,	date149,	name150,	point150,	target150,	team150,	location150,	Section150,	date150,	name151,	point151,	target151,	team151,	location151,	Section151,	date151,	name152,	point152,	target152,	team152,	location152,	Section152,	date152,	name153,	point153,	target153,	team153,	location153,	Section153,	date153,	name154,	point154,	target154,	team154,	location154,	Section154,	date154,	name155,	point155,	target155,	team155,	location155,	Section155,	date155,	name156,	point156,	target156,	team156,	location156,	Section156,	date156,	name157,	point157,	target157,	team157,	location157,	Section157,	date157,	name158,	point158,	target158,	team158,	location158,	Section158,	date158,	name159,	point159,	target159,	team159,	location159,	Section159,	date159,	name160,	point160,	target160,	team160,	location160,	Section160,	date160,	name161,	point161,	target161,	team161,	location161,	Section161,	date161,	name162,	point162,	target162,	team162,	location162,	Section162,	date162,	name163,	point163,	target163,	team163,	location163,	Section163,	date163,	name164,	point164,	target164,	team164,	location164,	Section164,	date164,	name165,	point165,	target165,	team165,	location165,	Section165,	date165,	name166,	point166,	target166,	team166,	location166,	Section166,	date166,	name167,	point167,	target167,	team167,	location167,	Section167,	date167,	name168,	point168,	target168,	team168,	location168,	Section168,	date168,	name169,	point169,	target169,	team169,	location169,	Section169,	date169,	name170,	point170,	target170,	team170,	location170,	Section170,	date170,	name171,	point171,	target171,	team171,	location171,	Section171,	date171,	name172,	point172,	target172,	team172,	location172,	Section172,	date172,	name173,	point173,	target173,	team173,	location173,	Section173,	date173,	name174,	point174,	target174,	team174,	location174,	Section174,	date174,	name175,	point175,	target175,	team175,	location175,	Section175,	date175,	name176,	point176,	target176,	team176,	location176,	Section176,	date176,	name177,	point177,	target177,	team177,	location177,	Section177,	date177,	name178,	point178,	target178,	team178,	location178,	Section178,	date178,	name179,	point179,	target179,	team179,	location179,	Section179,	date179,	name180,	point180,	target180,	team180,	location180,	Section180,	date180,	name181,	point181,	target181,	team181,	location181,	Section181,	date181,	name182,	point182,	target182,	team182,	location182,	Section182,	date182,	name183,	point183,	target183,	team183,	location183,	Section183,	date183,	name184,	point184,	target184,	team184,	location184,	Section184,	date184,	name185,	point185,	target185,	team185,	location185,	Section185,	date185,	name186,	point186,	target186,	team186,	location186,	Section186,	date186,	name187,	point187,	target187,	team187,	location187,	Section187,	date187,	name188,	point188,	target188,	team188,	location188,	Section188,	date188,	name189,	point189,	target189,	team189,	location189,	Section189,	date189,	name190,	point190,	target190,	team190,	location190,	Section190,	date190,	name191,	point191,	target191,	team191,	location191,	Section191,	date191,	name192,	point192,	target192,	team192,	location192,	Section192,	date192,	name193,	point193,	target193,	team193,	location193,	Section193,	date193,	name194,	point194,	target194,	team194,	location194,	Section194,	date194,	name195,	point195,	target195,	team195,	location195,	Section195,	date195,	name196,	point196,	target196,	team196,	location196,	Section196,	date196,	name197,	point197,	target197,	team197,	location197,	Section197,	date197,	name198,	point198,	target198,	team198,	location198,	Section198,	date198,	name199,	point199,	target199,	team199,	location199,	Section199,	date199,	name200,	point200,	target200,	team200,	location200,	Section200,	date200,	name201,	point201,	target201,	team201,	location201,	Section201,	date201,	name202,	point202,	target202,	team202,	location202,	Section202,	date202,	name203,	point203,	target203,	team203,	location203,	Section203,	date203,	name204,	point204,	target204,	team204,	location204,	Section204,	date204,	name205,	point205,	target205,	team205,	location205,	Section205,	date205,	name206,	point206,	target206,	team206,	location206,	Section206,	date206,	name207,	point207,	target207,	team207,	location207,	Section207,	date207,	name208,	point208,	target208,	team208,	location208,	Section208,	date208,	name209,	point209,	target209,	team209,	location209,	Section209,	date209,	name210,	point210,	target210,	team210,	location210,	Section210,	date210,	name211,	point211,	target211,	team211,	location211,	Section211,	date211,	name212,	point212,	target212,	team212,	location212,	Section212,	date212,	name213,	point213,	target213,	team213,	location213,	Section213,	date213,	name214,	point214,	target214,	team214,	location214,	Section214,	date214,	name215,	point215,	target215,	team215,	location215,	Section215,	date215,	name216,	point216,	target216,	team216,	location216,	Section216,	date216,	name217,	point217,	target217,	team217,	location217,	Section217,	date217,	name218,	point218,	target218,	team218,	location218,	Section218,	date218,	name219,	point219,	target219,	team219,	location219,	Section219,	date219,	name220,	point220,	target220,	team220,	location220,	Section220,	date220,	name221,	point221,	target221,	team221,	location221,	Section221,	date221,	name222,	point222,	target222,	team222,	location222,	Section222,	date222,	name223,	point223,	target223,	team223,	location223,	Section223,	date223,	name224,	point224,	target224,	team224,	location224,	Section224,	date224,	name225,	point225,	target225,	team225,	location225,	Section225,	date225,	name226,	point226,	target226,	team226,	location226,	Section226,	date226,	name227,	point227,	target227,	team227,	location227,	Section227,	date227,	name228,	point228,	target228,	team228,	location228,	Section228,	date228,	name229,	point229,	target229,	team229,	location229,	Section229,	date229,	name230,	point230,	target230,	team230,	location230,	Section230,	date230,	name231,	point231,	target231,	team231,	location231,	Section231,	date231,	name232,	point232,	target232,	team232,	location232,	Section232,	date232,	name233,	point233,	target233,	team233,	location233,	Section233,	date233,	name234,	point234,	target234,	team234,	location234,	Section234,	date234,	name235,	point235,	target235,	team235,	location235,	Section235,	date235,	name236,	point236,	target236,	team236,	location236,	Section236,	date236,	name237,	point237,	target237,	team237,	location237,	Section237,	date237,	name238,	point238,	target238,	team238,	location238,	Section238,	date238,	name239,	point239,	target239,	team239,	location239,	Section239,	date239,	name240,	point240,	target240,	team240,	location240,	Section240,	date240,	name241,	point241,	target241,	team241,	location241,	Section241,	date241,	name242,	point242,	target242,	team242,	location242,	Section242,	date242,	name243,	point243,	target243,	team243,	location243,	Section243,	date243,	name244,	point244,	target244,	team244,	location244,	Section244,	date244,	name245,	point245,	target245,	team245,	location245,	Section245,	date245,	name246,	point246,	target246,	team246,	location246,	Section246,	date246,	name247,	point247,	target247,	team247,	location247,	Section247,	date247,	name248,	point248,	target248,	team248,	location248,	Section248,	date248,	name249,	point249,	target249,	team249,	location249,	Section249,	date249,	name250,	point250,	target250,	team250,	location250,	Section250,	date250,	name251,	point251,	target251,	team251,	location251,	Section251,	date251,	name252,	point252,	target252,	team252,	location252,	Section252,	date252,	name253,	point253,	target253,	team253,	location253,	Section253,	date253,	name254,	point254,	target254,	team254,	location254,	Section254,	date254,	name255,	point255,	target255,	team255,	location255,	Section255,	date255,	name256,	point256,	target256,	team256,	location256,	Section256,	date256,	name257,	point257,	target257,	team257,	location257,	Section257,	date257,	name258,	point258,	target258,	team258,	location258,	Section258,	date258,	name259,	point259,	target259,	team259,	location259,	Section259,	date259,	name260,	point260,	target260,	team260,	location260,	Section260,	date260,	name261,	point261,	target261,	team261,	location261,	Section261,	date261,	name262,	point262,	target262,	team262,	location262,	Section262,	date262,	name263,	point263,	target263,	team263,	location263,	Section263,	date263,	name264,	point264,	target264,	team264,	location264,	Section264,	date264,	name265,	point265,	target265,	team265,	location265,	Section265,	date265,	name266,	point266,	target266,	team266,	location266,	Section266,	date266,	name267,	point267,	target267,	team267,	location267,	Section267,	date267,	name268,	point268,	target268,	team268,	location268,	Section268,	date268,	name269,	point269,	target269,	team269,	location269,	Section269,	date269,	name270,	point270,	target270,	team270,	location270,	Section270,	date270,	name271,	point271,	target271,	team271,	location271,	Section271,	date271,	name272,	point272,	target272,	team272,	location272,	Section272,	date272,	name273,	point273,	target273,	team273,	location273,	Section273,	date273,	name274,	point274,	target274,	team274,	location274,	Section274,	date274,	name275,	point275,	target275,	team275,	location275,	Section275,	date275,	name276,	point276,	target276,	team276,	location276,	Section276,	date276,	name277,	point277,	target277,	team277,	location277,	Section277,	date277,	name278,	point278,	target278,	team278,	location278,	Section278,	date278,	name279,	point279,	target279,	team279,	location279,	Section279,	date279,	name280,	point280,	target280,	team280,	location280,	Section280,	date280,	name281,	point281,	target281,	team281,	location281,	Section281,	date281,	name282,	point282,	target282,	team282,	location282,	Section282,	date282,	name283,	point283,	target283,	team283,	location283,	Section283,	date283,	name284,	point284,	target284,	team284,	location284,	Section284,	date284,	name285,	point285,	target285,	team285,	location285,	Section285,	date285,	name286,	point286,	target286,	team286,	location286,	Section286,	date286,	name287,	point287,	target287,	team287,	location287,	Section287,	date287,	name288,	point288,	target288,	team288,	location288,	Section288,	date288,	name289,	point289,	target289,	team289,	location289,	Section289,	date289,	name290,	point290,	target290,	team290,	location290,	Section290,	date290,	name291,	point291,	target291,	team291,	location291,	Section291,	date291,	name292,	point292,	target292,	team292,	location292,	Section292,	date292,	name293,	point293,	target293,	team293,	location293,	Section293,	date293,	name294,	point294,	target294,	team294,	location294,	Section294,	date294,	name295,	point295,	target295,	team295,	location295,	Section295,	date295,	name296,	point296,	target296,	team296,	location296,	Section296,	date296,	name297,	point297,	target297,	team297,	location297,	Section297,	date297,	name298,	point298,	target298,	team298,	location298,	Section298,	date298,	name299,	point299,	target299,	team299,	location299,	Section299,	date299,	name300,	point300,	target300,	team300,	location300,	Section300,	date300;

   EditText tmael1,driver1,comment1,	tmael2,driver2,comment2,	tmael3,driver3,comment3,	tmael4,driver4,comment4,	tmael5,driver5,comment5,	tmael6,driver6,comment6,	tmael7,driver7,comment7,	tmael8,driver8,comment8,	tmael9,driver9,comment9,	tmael10,driver10,comment10,	tmael11,driver11,comment11,	tmael12,driver12,comment12,	tmael13,driver13,comment13,	tmael14,driver14,comment14,	tmael15,driver15,comment15,	tmael16,driver16,comment16,	tmael17,driver17,comment17,	tmael18,driver18,comment18,	tmael19,driver19,comment19,	tmael20,driver20,comment20,	tmael21,driver21,comment21,	tmael22,driver22,comment22,	tmael23,driver23,comment23,	tmael24,driver24,comment24,	tmael25,driver25,comment25,	tmael26,driver26,comment26,	tmael27,driver27,comment27,	tmael28,driver28,comment28,	tmael29,driver29,comment29,	tmael30,driver30,comment30,	tmael31,driver31,comment31,	tmael32,driver32,comment32,	tmael33,driver33,comment33,	tmael34,driver34,comment34,	tmael35,driver35,comment35,	tmael36,driver36,comment36,	tmael37,driver37,comment37,	tmael38,driver38,comment38,	tmael39,driver39,comment39,	tmael40,driver40,comment40,	tmael41,driver41,comment41,	tmael42,driver42,comment42,	tmael43,driver43,comment43,	tmael44,driver44,comment44,	tmael45,driver45,comment45,	tmael46,driver46,comment46,	tmael47,driver47,comment47,	tmael48,driver48,comment48,	tmael49,driver49,comment49,	tmael50,driver50,comment50,	tmael51,driver51,comment51,	tmael52,driver52,comment52,	tmael53,driver53,comment53,	tmael54,driver54,comment54,	tmael55,driver55,comment55,	tmael56,driver56,comment56,	tmael57,driver57,comment57,	tmael58,driver58,comment58,	tmael59,driver59,comment59,	tmael60,driver60,comment60,	tmael61,driver61,comment61,	tmael62,driver62,comment62,	tmael63,driver63,comment63,	tmael64,driver64,comment64,	tmael65,driver65,comment65,	tmael66,driver66,comment66,	tmael67,driver67,comment67,	tmael68,driver68,comment68,	tmael69,driver69,comment69,	tmael70,driver70,comment70,	tmael71,driver71,comment71,	tmael72,driver72,comment72,	tmael73,driver73,comment73,	tmael74,driver74,comment74,	tmael75,driver75,comment75,	tmael76,driver76,comment76,	tmael77,driver77,comment77,	tmael78,driver78,comment78,	tmael79,driver79,comment79,	tmael80,driver80,comment80,	tmael81,driver81,comment81,	tmael82,driver82,comment82,	tmael83,driver83,comment83,	tmael84,driver84,comment84,	tmael85,driver85,comment85,	tmael86,driver86,comment86,	tmael87,driver87,comment87,	tmael88,driver88,comment88,	tmael89,driver89,comment89,	tmael90,driver90,comment90,	tmael91,driver91,comment91,	tmael92,driver92,comment92,	tmael93,driver93,comment93,	tmael94,driver94,comment94,	tmael95,driver95,comment95,	tmael96,driver96,comment96,	tmael97,driver97,comment97,	tmael98,driver98,comment98,	tmael99,driver99,comment99,	tmael100,driver100,comment100,	tmael101,driver101,comment101,	tmael102,driver102,comment102,	tmael103,driver103,comment103,	tmael104,driver104,comment104,	tmael105,driver105,comment105,	tmael106,driver106,comment106,	tmael107,driver107,comment107,	tmael108,driver108,comment108,	tmael109,driver109,comment109,	tmael110,driver110,comment110,	tmael111,driver111,comment111,	tmael112,driver112,comment112,	tmael113,driver113,comment113,	tmael114,driver114,comment114,	tmael115,driver115,comment115,	tmael116,driver116,comment116,	tmael117,driver117,comment117,	tmael118,driver118,comment118,	tmael119,driver119,comment119,	tmael120,driver120,comment120,	tmael121,driver121,comment121,	tmael122,driver122,comment122,	tmael123,driver123,comment123,	tmael124,driver124,comment124,	tmael125,driver125,comment125,	tmael126,driver126,comment126,	tmael127,driver127,comment127,	tmael128,driver128,comment128,	tmael129,driver129,comment129,	tmael130,driver130,comment130,	tmael131,driver131,comment131,	tmael132,driver132,comment132,	tmael133,driver133,comment133,	tmael134,driver134,comment134,	tmael135,driver135,comment135,	tmael136,driver136,comment136,	tmael137,driver137,comment137,	tmael138,driver138,comment138,	tmael139,driver139,comment139,	tmael140,driver140,comment140,	tmael141,driver141,comment141,	tmael142,driver142,comment142,	tmael143,driver143,comment143,	tmael144,driver144,comment144,	tmael145,driver145,comment145,	tmael146,driver146,comment146,	tmael147,driver147,comment147,	tmael148,driver148,comment148,	tmael149,driver149,comment149,	tmael150,driver150,comment150,	tmael151,driver151,comment151,	tmael152,driver152,comment152,	tmael153,driver153,comment153,	tmael154,driver154,comment154,	tmael155,driver155,comment155,	tmael156,driver156,comment156,	tmael157,driver157,comment157,	tmael158,driver158,comment158,	tmael159,driver159,comment159,	tmael160,driver160,comment160,	tmael161,driver161,comment161,	tmael162,driver162,comment162,	tmael163,driver163,comment163,	tmael164,driver164,comment164,	tmael165,driver165,comment165,	tmael166,driver166,comment166,	tmael167,driver167,comment167,	tmael168,driver168,comment168,	tmael169,driver169,comment169,	tmael170,driver170,comment170,	tmael171,driver171,comment171,	tmael172,driver172,comment172,	tmael173,driver173,comment173,	tmael174,driver174,comment174,	tmael175,driver175,comment175,	tmael176,driver176,comment176,	tmael177,driver177,comment177,	tmael178,driver178,comment178,	tmael179,driver179,comment179,	tmael180,driver180,comment180,	tmael181,driver181,comment181,	tmael182,driver182,comment182,	tmael183,driver183,comment183,	tmael184,driver184,comment184,	tmael185,driver185,comment185,	tmael186,driver186,comment186,	tmael187,driver187,comment187,	tmael188,driver188,comment188,	tmael189,driver189,comment189,	tmael190,driver190,comment190,	tmael191,driver191,comment191,	tmael192,driver192,comment192,	tmael193,driver193,comment193,	tmael194,driver194,comment194,	tmael195,driver195,comment195,	tmael196,driver196,comment196,	tmael197,driver197,comment197,	tmael198,driver198,comment198,	tmael199,driver199,comment199,	tmael200,driver200,comment200,	tmael201,driver201,comment201,	tmael202,driver202,comment202,	tmael203,driver203,comment203,	tmael204,driver204,comment204,	tmael205,driver205,comment205,	tmael206,driver206,comment206,	tmael207,driver207,comment207,	tmael208,driver208,comment208,	tmael209,driver209,comment209,	tmael210,driver210,comment210,	tmael211,driver211,comment211,	tmael212,driver212,comment212,	tmael213,driver213,comment213,	tmael214,driver214,comment214,	tmael215,driver215,comment215,	tmael216,driver216,comment216,	tmael217,driver217,comment217,	tmael218,driver218,comment218,	tmael219,driver219,comment219,	tmael220,driver220,comment220,	tmael221,driver221,comment221,	tmael222,driver222,comment222,	tmael223,driver223,comment223,	tmael224,driver224,comment224,	tmael225,driver225,comment225,	tmael226,driver226,comment226,	tmael227,driver227,comment227,	tmael228,driver228,comment228,	tmael229,driver229,comment229,	tmael230,driver230,comment230,	tmael231,driver231,comment231,	tmael232,driver232,comment232,	tmael233,driver233,comment233,	tmael234,driver234,comment234,	tmael235,driver235,comment235,	tmael236,driver236,comment236,	tmael237,driver237,comment237,	tmael238,driver238,comment238,	tmael239,driver239,comment239,	tmael240,driver240,comment240,	tmael241,driver241,comment241,	tmael242,driver242,comment242,	tmael243,driver243,comment243,	tmael244,driver244,comment244,	tmael245,driver245,comment245,	tmael246,driver246,comment246,	tmael247,driver247,comment247,	tmael248,driver248,comment248,	tmael249,driver249,comment249,	tmael250,driver250,comment250,	tmael251,driver251,comment251,	tmael252,driver252,comment252,	tmael253,driver253,comment253,	tmael254,driver254,comment254,	tmael255,driver255,comment255,	tmael256,driver256,comment256,	tmael257,driver257,comment257,	tmael258,driver258,comment258,	tmael259,driver259,comment259,	tmael260,driver260,comment260,	tmael261,driver261,comment261,	tmael262,driver262,comment262,	tmael263,driver263,comment263,	tmael264,driver264,comment264,	tmael265,driver265,comment265,	tmael266,driver266,comment266,	tmael267,driver267,comment267,	tmael268,driver268,comment268,	tmael269,driver269,comment269,	tmael270,driver270,comment270,	tmael271,driver271,comment271,	tmael272,driver272,comment272,	tmael273,driver273,comment273,	tmael274,driver274,comment274,	tmael275,driver275,comment275,	tmael276,driver276,comment276,	tmael277,driver277,comment277,	tmael278,driver278,comment278,	tmael279,driver279,comment279,	tmael280,driver280,comment280,	tmael281,driver281,comment281,	tmael282,driver282,comment282,	tmael283,driver283,comment283,	tmael284,driver284,comment284,	tmael285,driver285,comment285,	tmael286,driver286,comment286,	tmael287,driver287,comment287,	tmael288,driver288,comment288,	tmael289,driver289,comment289,	tmael290,driver290,comment290,	tmael291,driver291,comment291,	tmael292,driver292,comment292,	tmael293,driver293,comment293,	tmael294,driver294,comment294,	tmael295,driver295,comment295,	tmael296,driver296,comment296,	tmael297,driver297,comment297,	tmael298,driver298,comment298,	tmael299,driver299,comment299,	tmael300,driver300,comment300;
   Switch s1,s2,s3,s4,s5,sm1,sm2,sm3,sm4,sm5, s6,	s7,	s8,	s9,	s10,	s11,	s12,	s13,	s14,	s15,	s16,	s17,	s18,	s19,	s20,	s21,	s22,	s23,	s24,	s25,	s26,	s27,	s28,	s29,	s30,	s31,	s32,	s33,	s34,	s35,	s36,	s37,	s38,	s39,	s40,	s41,	s42,	s43,	s44,	s45,	s46,	s47,	s48,	s49,	s50,	s51,	s52,	s53,	s54,	s55,	s56,	s57,	s58,	s59,	s60,	s61,	s62,	s63,	s64,	s65,	s66,	s67,	s68,	s69,	s70,	s71,	s72,	s73,	s74,	s75,	s76,	s77,	s78,	s79,	s80,	s81,	s82,	s83,	s84,	s85,	s86,	s87,	s88,	s89,	s90,	s91,	s92,	s93,	s94,	s95,	s96,	s97,	s98,	s99,	s100,	s101,	s102,	s103,	s104,	s105,	s106,	s107,	s108,	s109,	s110,	s111,	s112,	s113,	s114,	s115,	s116,	s117,	s118,	s119,	s120,	s121,	s122,	s123,	s124,	s125,	s126,	s127,	s128,	s129,	s130,	s131,	s132,	s133,	s134,	s135,	s136,	s137,	s138,	s139,	s140,	s141,	s142,	s143,	s144,	s145,	s146,	s147,	s148,	s149,	s150,	s151,	s152,	s153,	s154,	s155,	s156,	s157,	s158,	s159,	s160,	s161,	s162,	s163,	s164,	s165,	s166,	s167,	s168,	s169,	s170,	s171,	s172,	s173,	s174,	s175,	s176,	s177,	s178,	s179,	s180,	s181,	s182,	s183,	s184,	s185,	s186,	s187,	s188,	s189,	s190,	s191,	s192,	s193,	s194,	s195,	s196,	s197,	s198,	s199,	s200,	s201,	s202,	s203,	s204,	s205,	s206,	s207,	s208,	s209,	s210,	s211,	s212,	s213,	s214,	s215,	s216,	s217,	s218,	s219,	s220,	s221,	s222,	s223,	s224,	s225,	s226,	s227,	s228,	s229,	s230,	s231,	s232,	s233,	s234,	s235,	s236,	s237,	s238,	s239,	s240,	s241,	s242,	s243,	s244,	s245,	s246,	s247,	s248,	s249,	s250,	s251,	s252,	s253,	s254,	s255,	s256,	s257,	s258,	s259,	s260,	s261,	s262,	s263,	s264,	s265,	s266,	s267,	s268,	s269,	s270,	s271,	s272,	s273,	s274,	s275,	s276,	s277,	s278,	s279,	s280,	s281,	s282,	s283,	s284,	s285,	s286,	s287,	s288,	s289,	s290,	s291,	s292,	s293,	s294,	s295,	s296,	s297,	s298,	s299,	s300, sm6,	sm7,	sm8,	sm9,	sm10,	sm11,	sm12,	sm13,	sm14,	sm15,	sm16,	sm17,	sm18,	sm19,	sm20,	sm21,	sm22,	sm23,	sm24,	sm25,	sm26,	sm27,	sm28,	sm29,	sm30,	sm31,	sm32,	sm33,	sm34,	sm35,	sm36,	sm37,	sm38,	sm39,	sm40,	sm41,	sm42,	sm43,	sm44,	sm45,	sm46,	sm47,	sm48,	sm49,	sm50,	sm51,	sm52,	sm53,	sm54,	sm55,	sm56,	sm57,	sm58,	sm59,	sm60,	sm61,	sm62,	sm63,	sm64,	sm65,	sm66,	sm67,	sm68,	sm69,	sm70,	sm71,	sm72,	sm73,	sm74,	sm75,	sm76,	sm77,	sm78,	sm79,	sm80,	sm81,	sm82,	sm83,	sm84,	sm85,	sm86,	sm87,	sm88,	sm89,	sm90,	sm91,	sm92,	sm93,	sm94,	sm95,	sm96,	sm97,	sm98,	sm99,	sm100,	sm101,	sm102,	sm103,	sm104,	sm105,	sm106,	sm107,	sm108,	sm109,	sm110,	sm111,	sm112,	sm113,	sm114,	sm115,	sm116,	sm117,	sm118,	sm119,	sm120,	sm121,	sm122,	sm123,	sm124,	sm125,	sm126,	sm127,	sm128,	sm129,	sm130,	sm131,	sm132,	sm133,	sm134,	sm135,	sm136,	sm137,	sm138,	sm139,	sm140,	sm141,	sm142,	sm143,	sm144,	sm145,	sm146,	sm147,	sm148,	sm149,	sm150,	sm151,	sm152,	sm153,	sm154,	sm155,	sm156,	sm157,	sm158,	sm159,	sm160,	sm161,	sm162,	sm163,	sm164,	sm165,	sm166,	sm167,	sm168,	sm169,	sm170,	sm171,	sm172,	sm173,	sm174,	sm175,	sm176,	sm177,	sm178,	sm179,	sm180,	sm181,	sm182,	sm183,	sm184,	sm185,	sm186,	sm187,	sm188,	sm189,	sm190,	sm191,	sm192,	sm193,	sm194,	sm195,	sm196,	sm197,	sm198,	sm199,	sm200,	sm201,	sm202,	sm203,	sm204,	sm205,	sm206,	sm207,	sm208,	sm209,	sm210,	sm211,	sm212,	sm213,	sm214,	sm215,	sm216,	sm217,	sm218,	sm219,	sm220,	sm221,	sm222,	sm223,	sm224,	sm225,	sm226,	sm227,	sm228,	sm229,	sm230,	sm231,	sm232,	sm233,	sm234,	sm235,	sm236,	sm237,	sm238,	sm239,	sm240,	sm241,	sm242,	sm243,	sm244,	sm245,	sm246,	sm247,	sm248,	sm249,	sm250,	sm251,	sm252,	sm253,	sm254,	sm255,	sm256,	sm257,	sm258,	sm259,	sm260,	sm261,	sm262,	sm263,	sm264,	sm265,	sm266,	sm267,	sm268,	sm269,	sm270,	sm271,	sm272,	sm273,	sm274,	sm275,	sm276,	sm277,	sm278,	sm279,	sm280,	sm281,	sm282,	sm283,	sm284,	sm285,	sm286,	sm287,	sm288,	sm289,	sm290,	sm291,	sm292,	sm293,	sm294,	sm295,	sm296,	sm297,	sm298,	sm299,	sm300;
    TableRow Tab1,Tab2,Tab3,Tab4,Tab5,Tab6,Tab7,Tab8,Tab9,Tab10;
    Integer numTask;
   Boolean isAllFABVisible,v,b1,bm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        add_task = findViewById(R.id.add_task);
        edit_task = findViewById(R.id.edit_task);
        fab = findViewById(R.id.fab);
        ta_add = findViewById(R.id.ta_add);
        ta_edit = findViewById(R.id.ta_edit);

        ta_add.setVisibility(View.GONE);
        ta_edit.setVisibility(View.GONE);
        edit_task.setVisibility(View.GONE);
        add_task.setVisibility(View.GONE);

        isAllFABVisible=false;

        fab.shrink();








        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!isAllFABVisible) {
                    add_task.show();
                    edit_task.show();
                    ta_add.setVisibility(View.VISIBLE);
                    ta_edit.setVisibility(View.VISIBLE);

                    fab.extend();
                    fab.setIconTintResource(R.color.design_default_color_error);
                    fab.setRotation(44);


                    isAllFABVisible = true;


                } else {
                    fab.setRotation(180);
                    add_task.hide();
                    edit_task.hide();
                    ta_edit.setVisibility(View.GONE);
                    ta_add.setVisibility(View.GONE);
                    fab.shrink();
                    fab.setIconTintResource(R.color.ic_cansl_background);

                    isAllFABVisible = false;


                }

                add_task.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity2.this, Add_Task.class);
                        startActivity(intent);

                        Toast.makeText(MainActivity2.this, "ضيف المهمة من بعد إذنك", Toast.LENGTH_SHORT).show();
                    }
                });











            }
        });
        name1 = findViewById(R.id.name1);
        point1 = findViewById(R.id.point1);
        Section1 = findViewById(R.id.Section1);
        target1 = findViewById(R.id.target1);
        team1 = findViewById(R.id.team1);
        location1 = findViewById(R.id.location1);

        name2 = findViewById(R.id.name2);
        point2 = findViewById(R.id.point2);
        Section2 = findViewById(R.id.Section2);
        target2 = findViewById(R.id.target2);
        team2 = findViewById(R.id.team2);
        location2 = findViewById(R.id.location2);

        name3 = findViewById(R.id.name3);
        point3 = findViewById(R.id.point3);
        Section3 = findViewById(R.id.Section3);
        target3 = findViewById(R.id.target3);
        team3 = findViewById(R.id.team3);
        location3 = findViewById(R.id.location3);

        name4 = findViewById(R.id.name4);
        point4 = findViewById(R.id.point4);
        Section4 = findViewById(R.id.Section4);
        target4 = findViewById(R.id.target4);
        team4 = findViewById(R.id.team4);
        location4 = findViewById(R.id.location4);

        name5 = findViewById(R.id.name5);
        point5 = findViewById(R.id.point5);
        Section5 = findViewById(R.id.Section5);
        target5 = findViewById(R.id.target5);
        team5 = findViewById(R.id.team5);
        location5 = findViewById(R.id.location5);
        Tab1= findViewById(R.id.Tab1);
        Tab2= findViewById(R.id.Tab2);
        Tab3= findViewById(R.id.Tab3);
        Tab4= findViewById(R.id.Tab4);
        Tab5= findViewById(R.id.Tab5);

        tmael1= findViewById(R.id.tmael1);
        tmael2= findViewById(R.id.tmael2);
        tmael3= findViewById(R.id.tmael3);
        tmael4= findViewById(R.id.tmael4);
        tmael5= findViewById(R.id.tmael5);

        date1= findViewById(R.id.date1);
        date2= findViewById(R.id.date2);
        date3= findViewById(R.id.date3);
        date4= findViewById(R.id.date4);
        date5= findViewById(R.id.date5);

        driver1= findViewById(R.id.driver1);
        driver2= findViewById(R.id.driver2);
        driver3= findViewById(R.id.driver3);
        driver4= findViewById(R.id.driver4);
        driver5= findViewById(R.id.driver5);

        comment1= findViewById(R.id.comment1);
        comment2= findViewById(R.id.comment2);
        comment3= findViewById(R.id.comment3);
        comment4= findViewById(R.id.comment4);
        comment5= findViewById(R.id.comment5);
        s1= findViewById(R.id.s1);
        s2= findViewById(R.id.s2);
        s3= findViewById(R.id.s3);
        s4= findViewById(R.id.s4);
        s5= findViewById(R.id.s5);
        sm1= findViewById(R.id.sm1);
        sm2= findViewById(R.id.sm2);
        sm3= findViewById(R.id.sm3);
        sm4= findViewById(R.id.sm4);
        sm5= findViewById(R.id.sm5);
        name6=findViewById(R.id.name6);
        point6=findViewById(R.id.point6);
        Section6=findViewById(R.id.Section6);
        target6=findViewById(R.id.target6);
        team6=findViewById(R.id.team6);
        location6=findViewById(R.id.location6);
        tmael6= findViewById(R.id.tmael6);
        date6= findViewById(R.id.date6);
        driver6= findViewById(R.id.driver6);
        comment6= findViewById(R.id.comment6);
        s6= findViewById(R.id.s6);
        sm6= findViewById(R.id.sm6);
        name7=findViewById(R.id.name7);
        point7=findViewById(R.id.point7);
        Section7=findViewById(R.id.Section7);
        target7=findViewById(R.id.target7);
        team7=findViewById(R.id.team7);
        location7=findViewById(R.id.location7);
        tmael7= findViewById(R.id.tmael7);
        date7= findViewById(R.id.date7);
        driver7= findViewById(R.id.driver7);
        comment7= findViewById(R.id.comment7);
        s7= findViewById(R.id.s7);
        sm7= findViewById(R.id.sm7);
        name8=findViewById(R.id.name8);
        point8=findViewById(R.id.point8);
        Section8=findViewById(R.id.Section8);
        target8=findViewById(R.id.target8);
        team8=findViewById(R.id.team8);
        location8=findViewById(R.id.location8);
        tmael8= findViewById(R.id.tmael8);
        date8= findViewById(R.id.date8);
        driver8= findViewById(R.id.driver8);
        comment8= findViewById(R.id.comment8);
        s8= findViewById(R.id.s8);
        sm8= findViewById(R.id.sm8);
        name9=findViewById(R.id.name9);
        point9=findViewById(R.id.point9);
        Section9=findViewById(R.id.Section9);
        target9=findViewById(R.id.target9);
        team9=findViewById(R.id.team9);
        location9=findViewById(R.id.location9);
        tmael9= findViewById(R.id.tmael9);
        date9= findViewById(R.id.date9);
        driver9= findViewById(R.id.driver9);
        comment9= findViewById(R.id.comment9);
        s9= findViewById(R.id.s9);
        sm9= findViewById(R.id.sm9);
        name10=findViewById(R.id.name10);
        point10=findViewById(R.id.point10);
        Section10=findViewById(R.id.Section10);
        target10=findViewById(R.id.target10);
        team10=findViewById(R.id.team10);
        location10=findViewById(R.id.location10);
        tmael10= findViewById(R.id.tmael10);
        date10= findViewById(R.id.date10);
        driver10= findViewById(R.id.driver10);
        comment10= findViewById(R.id.comment10);
        s10= findViewById(R.id.s10);
        sm10= findViewById(R.id.sm10);
        name11=findViewById(R.id.name11);
        point11=findViewById(R.id.point11);
        Section11=findViewById(R.id.Section11);
        target11=findViewById(R.id.target11);
        team11=findViewById(R.id.team11);
        location11=findViewById(R.id.location11);
        tmael11= findViewById(R.id.tmael11);
        date11= findViewById(R.id.date11);
        driver11= findViewById(R.id.driver11);
        comment11= findViewById(R.id.comment11);
        s11= findViewById(R.id.s11);
        sm11= findViewById(R.id.sm11);
        name12=findViewById(R.id.name12);
        point12=findViewById(R.id.point12);
        Section12=findViewById(R.id.Section12);
        target12=findViewById(R.id.target12);
        team12=findViewById(R.id.team12);
        location12=findViewById(R.id.location12);
        tmael12= findViewById(R.id.tmael12);
        date12= findViewById(R.id.date12);
        driver12= findViewById(R.id.driver12);
        comment12= findViewById(R.id.comment12);
        s12= findViewById(R.id.s12);
        sm12= findViewById(R.id.sm12);
        name13=findViewById(R.id.name13);
        point13=findViewById(R.id.point13);
        Section13=findViewById(R.id.Section13);
        target13=findViewById(R.id.target13);
        team13=findViewById(R.id.team13);
        location13=findViewById(R.id.location13);
        tmael13= findViewById(R.id.tmael13);
        date13= findViewById(R.id.date13);
        driver13= findViewById(R.id.driver13);
        comment13= findViewById(R.id.comment13);
        s13= findViewById(R.id.s13);
        sm13= findViewById(R.id.sm13);
        name14=findViewById(R.id.name14);
        point14=findViewById(R.id.point14);
        Section14=findViewById(R.id.Section14);
        target14=findViewById(R.id.target14);
        team14=findViewById(R.id.team14);
        location14=findViewById(R.id.location14);
        tmael14= findViewById(R.id.tmael14);
        date14= findViewById(R.id.date14);
        driver14= findViewById(R.id.driver14);
        comment14= findViewById(R.id.comment14);
        s14= findViewById(R.id.s14);
        sm14= findViewById(R.id.sm14);
        name15=findViewById(R.id.name15);
        point15=findViewById(R.id.point15);
        Section15=findViewById(R.id.Section15);
        target15=findViewById(R.id.target15);
        team15=findViewById(R.id.team15);
        location15=findViewById(R.id.location15);
        tmael15= findViewById(R.id.tmael15);
        date15= findViewById(R.id.date15);
        driver15= findViewById(R.id.driver15);
        comment15= findViewById(R.id.comment15);
        s15= findViewById(R.id.s15);
        sm15= findViewById(R.id.sm15);
        name16=findViewById(R.id.name16);
        point16=findViewById(R.id.point16);
        Section16=findViewById(R.id.Section16);
        target16=findViewById(R.id.target16);
        team16=findViewById(R.id.team16);
        location16=findViewById(R.id.location16);
        tmael16= findViewById(R.id.tmael16);
        date16= findViewById(R.id.date16);
        driver16= findViewById(R.id.driver16);
        comment16= findViewById(R.id.comment16);
        s16= findViewById(R.id.s16);
        sm16= findViewById(R.id.sm16);
        name17=findViewById(R.id.name17);
        point17=findViewById(R.id.point17);
        Section17=findViewById(R.id.Section17);
        target17=findViewById(R.id.target17);
        team17=findViewById(R.id.team17);
        location17=findViewById(R.id.location17);
        tmael17= findViewById(R.id.tmael17);
        date17= findViewById(R.id.date17);
        driver17= findViewById(R.id.driver17);
        comment17= findViewById(R.id.comment17);
        s17= findViewById(R.id.s17);
        sm17= findViewById(R.id.sm17);
        name18=findViewById(R.id.name18);
        point18=findViewById(R.id.point18);
        Section18=findViewById(R.id.Section18);
        target18=findViewById(R.id.target18);
        team18=findViewById(R.id.team18);
        location18=findViewById(R.id.location18);
        tmael18= findViewById(R.id.tmael18);
        date18= findViewById(R.id.date18);
        driver18= findViewById(R.id.driver18);
        comment18= findViewById(R.id.comment18);
        s18= findViewById(R.id.s18);
        sm18= findViewById(R.id.sm18);
        name19=findViewById(R.id.name19);
        point19=findViewById(R.id.point19);
        Section19=findViewById(R.id.Section19);
        target19=findViewById(R.id.target19);
        team19=findViewById(R.id.team19);
        location19=findViewById(R.id.location19);
        tmael19= findViewById(R.id.tmael19);
        date19= findViewById(R.id.date19);
        driver19= findViewById(R.id.driver19);
        comment19= findViewById(R.id.comment19);
        s19= findViewById(R.id.s19);
        sm19= findViewById(R.id.sm19);
        name20=findViewById(R.id.name20);
        point20=findViewById(R.id.point20);
        Section20=findViewById(R.id.Section20);
        target20=findViewById(R.id.target20);
        team20=findViewById(R.id.team20);
        location20=findViewById(R.id.location20);
        tmael20= findViewById(R.id.tmael20);
        date20= findViewById(R.id.date20);
        driver20= findViewById(R.id.driver20);
        comment20= findViewById(R.id.comment20);
        s20= findViewById(R.id.s20);
        sm20= findViewById(R.id.sm20);
        name21=findViewById(R.id.name21);
        point21=findViewById(R.id.point21);
        Section21=findViewById(R.id.Section21);
        target21=findViewById(R.id.target21);
        team21=findViewById(R.id.team21);
        location21=findViewById(R.id.location21);
        tmael21= findViewById(R.id.tmael21);
        date21= findViewById(R.id.date21);
        driver21= findViewById(R.id.driver21);
        comment21= findViewById(R.id.comment21);
        s21= findViewById(R.id.s21);
        sm21= findViewById(R.id.sm21);
        name22=findViewById(R.id.name22);
        point22=findViewById(R.id.point22);
        Section22=findViewById(R.id.Section22);
        target22=findViewById(R.id.target22);
        team22=findViewById(R.id.team22);
        location22=findViewById(R.id.location22);
        tmael22= findViewById(R.id.tmael22);
        date22= findViewById(R.id.date22);
        driver22= findViewById(R.id.driver22);
        comment22= findViewById(R.id.comment22);
        s22= findViewById(R.id.s22);
        sm22= findViewById(R.id.sm22);
        name23=findViewById(R.id.name23);
        point23=findViewById(R.id.point23);
        Section23=findViewById(R.id.Section23);
        target23=findViewById(R.id.target23);
        team23=findViewById(R.id.team23);
        location23=findViewById(R.id.location23);
        tmael23= findViewById(R.id.tmael23);
        date23= findViewById(R.id.date23);
        driver23= findViewById(R.id.driver23);
        comment23= findViewById(R.id.comment23);
        s23= findViewById(R.id.s23);
        sm23= findViewById(R.id.sm23);
        name24=findViewById(R.id.name24);
        point24=findViewById(R.id.point24);
        Section24=findViewById(R.id.Section24);
        target24=findViewById(R.id.target24);
        team24=findViewById(R.id.team24);
        location24=findViewById(R.id.location24);
        tmael24= findViewById(R.id.tmael24);
        date24= findViewById(R.id.date24);
        driver24= findViewById(R.id.driver24);
        comment24= findViewById(R.id.comment24);
        s24= findViewById(R.id.s24);
        sm24= findViewById(R.id.sm24);
        name25=findViewById(R.id.name25);
        point25=findViewById(R.id.point25);
        Section25=findViewById(R.id.Section25);
        target25=findViewById(R.id.target25);
        team25=findViewById(R.id.team25);
        location25=findViewById(R.id.location25);
        tmael25= findViewById(R.id.tmael25);
        date25= findViewById(R.id.date25);
        driver25= findViewById(R.id.driver25);
        comment25= findViewById(R.id.comment25);
        s25= findViewById(R.id.s25);
        sm25= findViewById(R.id.sm25);
        name26=findViewById(R.id.name26);
        point26=findViewById(R.id.point26);
        Section26=findViewById(R.id.Section26);
        target26=findViewById(R.id.target26);
        team26=findViewById(R.id.team26);
        location26=findViewById(R.id.location26);
        tmael26= findViewById(R.id.tmael26);
        date26= findViewById(R.id.date26);
        driver26= findViewById(R.id.driver26);
        comment26= findViewById(R.id.comment26);
        s26= findViewById(R.id.s26);
        sm26= findViewById(R.id.sm26);
        name27=findViewById(R.id.name27);
        point27=findViewById(R.id.point27);
        Section27=findViewById(R.id.Section27);
        target27=findViewById(R.id.target27);
        team27=findViewById(R.id.team27);
        location27=findViewById(R.id.location27);
        tmael27= findViewById(R.id.tmael27);
        date27= findViewById(R.id.date27);
        driver27= findViewById(R.id.driver27);
        comment27= findViewById(R.id.comment27);
        s27= findViewById(R.id.s27);
        sm27= findViewById(R.id.sm27);
        name28=findViewById(R.id.name28);
        point28=findViewById(R.id.point28);
        Section28=findViewById(R.id.Section28);
        target28=findViewById(R.id.target28);
        team28=findViewById(R.id.team28);
        location28=findViewById(R.id.location28);
        tmael28= findViewById(R.id.tmael28);
        date28= findViewById(R.id.date28);
        driver28= findViewById(R.id.driver28);
        comment28= findViewById(R.id.comment28);
        s28= findViewById(R.id.s28);
        sm28= findViewById(R.id.sm28);
        name29=findViewById(R.id.name29);
        point29=findViewById(R.id.point29);
        Section29=findViewById(R.id.Section29);
        target29=findViewById(R.id.target29);
        team29=findViewById(R.id.team29);
        location29=findViewById(R.id.location29);
        tmael29= findViewById(R.id.tmael29);
        date29= findViewById(R.id.date29);
        driver29= findViewById(R.id.driver29);
        comment29= findViewById(R.id.comment29);
        s29= findViewById(R.id.s29);
        sm29= findViewById(R.id.sm29);
        name30=findViewById(R.id.name30);
        point30=findViewById(R.id.point30);
        Section30=findViewById(R.id.Section30);
        target30=findViewById(R.id.target30);
        team30=findViewById(R.id.team30);
        location30=findViewById(R.id.location30);
        tmael30= findViewById(R.id.tmael30);
        date30= findViewById(R.id.date30);
        driver30= findViewById(R.id.driver30);
        comment30= findViewById(R.id.comment30);
        s30= findViewById(R.id.s30);
        sm30= findViewById(R.id.sm30);
        name31=findViewById(R.id.name31);
        point31=findViewById(R.id.point31);
        Section31=findViewById(R.id.Section31);
        target31=findViewById(R.id.target31);
        team31=findViewById(R.id.team31);
        location31=findViewById(R.id.location31);
        tmael31= findViewById(R.id.tmael31);
        date31= findViewById(R.id.date31);
        driver31= findViewById(R.id.driver31);
        comment31= findViewById(R.id.comment31);
        s31= findViewById(R.id.s31);
        sm31= findViewById(R.id.sm31);
        name32=findViewById(R.id.name32);
        point32=findViewById(R.id.point32);
        Section32=findViewById(R.id.Section32);
        target32=findViewById(R.id.target32);
        team32=findViewById(R.id.team32);
        location32=findViewById(R.id.location32);
        tmael32= findViewById(R.id.tmael32);
        date32= findViewById(R.id.date32);
        driver32= findViewById(R.id.driver32);
        comment32= findViewById(R.id.comment32);
        s32= findViewById(R.id.s32);
        sm32= findViewById(R.id.sm32);
        name33=findViewById(R.id.name33);
        point33=findViewById(R.id.point33);
        Section33=findViewById(R.id.Section33);
        target33=findViewById(R.id.target33);
        team33=findViewById(R.id.team33);
        location33=findViewById(R.id.location33);
        tmael33= findViewById(R.id.tmael33);
        date33= findViewById(R.id.date33);
        driver33= findViewById(R.id.driver33);
        comment33= findViewById(R.id.comment33);
        s33= findViewById(R.id.s33);
        sm33= findViewById(R.id.sm33);
        name34=findViewById(R.id.name34);
        point34=findViewById(R.id.point34);
        Section34=findViewById(R.id.Section34);
        target34=findViewById(R.id.target34);
        team34=findViewById(R.id.team34);
        location34=findViewById(R.id.location34);
        tmael34= findViewById(R.id.tmael34);
        date34= findViewById(R.id.date34);
        driver34= findViewById(R.id.driver34);
        comment34= findViewById(R.id.comment34);
        s34= findViewById(R.id.s34);
        sm34= findViewById(R.id.sm34);
        name35=findViewById(R.id.name35);
        point35=findViewById(R.id.point35);
        Section35=findViewById(R.id.Section35);
        target35=findViewById(R.id.target35);
        team35=findViewById(R.id.team35);
        location35=findViewById(R.id.location35);
        tmael35= findViewById(R.id.tmael35);
        date35= findViewById(R.id.date35);
        driver35= findViewById(R.id.driver35);
        comment35= findViewById(R.id.comment35);
        s35= findViewById(R.id.s35);
        sm35= findViewById(R.id.sm35);
        name36=findViewById(R.id.name36);
        point36=findViewById(R.id.point36);
        Section36=findViewById(R.id.Section36);
        target36=findViewById(R.id.target36);
        team36=findViewById(R.id.team36);
        location36=findViewById(R.id.location36);
        tmael36= findViewById(R.id.tmael36);
        date36= findViewById(R.id.date36);
        driver36= findViewById(R.id.driver36);
        comment36= findViewById(R.id.comment36);
        s36= findViewById(R.id.s36);
        sm36= findViewById(R.id.sm36);
        name37=findViewById(R.id.name37);
        point37=findViewById(R.id.point37);
        Section37=findViewById(R.id.Section37);
        target37=findViewById(R.id.target37);
        team37=findViewById(R.id.team37);
        location37=findViewById(R.id.location37);
        tmael37= findViewById(R.id.tmael37);
        date37= findViewById(R.id.date37);
        driver37= findViewById(R.id.driver37);
        comment37= findViewById(R.id.comment37);
        s37= findViewById(R.id.s37);
        sm37= findViewById(R.id.sm37);
        name38=findViewById(R.id.name38);
        point38=findViewById(R.id.point38);
        Section38=findViewById(R.id.Section38);
        target38=findViewById(R.id.target38);
        team38=findViewById(R.id.team38);
        location38=findViewById(R.id.location38);
        tmael38= findViewById(R.id.tmael38);
        date38= findViewById(R.id.date38);
        driver38= findViewById(R.id.driver38);
        comment38= findViewById(R.id.comment38);
        s38= findViewById(R.id.s38);
        sm38= findViewById(R.id.sm38);
        name39=findViewById(R.id.name39);
        point39=findViewById(R.id.point39);
        Section39=findViewById(R.id.Section39);
        target39=findViewById(R.id.target39);
        team39=findViewById(R.id.team39);
        location39=findViewById(R.id.location39);
        tmael39= findViewById(R.id.tmael39);
        date39= findViewById(R.id.date39);
        driver39= findViewById(R.id.driver39);
        comment39= findViewById(R.id.comment39);
        s39= findViewById(R.id.s39);
        sm39= findViewById(R.id.sm39);
        name40=findViewById(R.id.name40);
        point40=findViewById(R.id.point40);
        Section40=findViewById(R.id.Section40);
        target40=findViewById(R.id.target40);
        team40=findViewById(R.id.team40);
        location40=findViewById(R.id.location40);
        tmael40= findViewById(R.id.tmael40);
        date40= findViewById(R.id.date40);
        driver40= findViewById(R.id.driver40);
        comment40= findViewById(R.id.comment40);
        s40= findViewById(R.id.s40);
        sm40= findViewById(R.id.sm40);
        name41=findViewById(R.id.name41);
        point41=findViewById(R.id.point41);
        Section41=findViewById(R.id.Section41);
        target41=findViewById(R.id.target41);
        team41=findViewById(R.id.team41);
        location41=findViewById(R.id.location41);
        tmael41= findViewById(R.id.tmael41);
        date41= findViewById(R.id.date41);
        driver41= findViewById(R.id.driver41);
        comment41= findViewById(R.id.comment41);
        s41= findViewById(R.id.s41);
        sm41= findViewById(R.id.sm41);
        name42=findViewById(R.id.name42);
        point42=findViewById(R.id.point42);
        Section42=findViewById(R.id.Section42);
        target42=findViewById(R.id.target42);
        team42=findViewById(R.id.team42);
        location42=findViewById(R.id.location42);
        tmael42= findViewById(R.id.tmael42);
        date42= findViewById(R.id.date42);
        driver42= findViewById(R.id.driver42);
        comment42= findViewById(R.id.comment42);
        s42= findViewById(R.id.s42);
        sm42= findViewById(R.id.sm42);
        name43=findViewById(R.id.name43);
        point43=findViewById(R.id.point43);
        Section43=findViewById(R.id.Section43);
        target43=findViewById(R.id.target43);
        team43=findViewById(R.id.team43);
        location43=findViewById(R.id.location43);
        tmael43= findViewById(R.id.tmael43);
        date43= findViewById(R.id.date43);
        driver43= findViewById(R.id.driver43);
        comment43= findViewById(R.id.comment43);
        s43= findViewById(R.id.s43);
        sm43= findViewById(R.id.sm43);
        name44=findViewById(R.id.name44);
        point44=findViewById(R.id.point44);
        Section44=findViewById(R.id.Section44);
        target44=findViewById(R.id.target44);
        team44=findViewById(R.id.team44);
        location44=findViewById(R.id.location44);
        tmael44= findViewById(R.id.tmael44);
        date44= findViewById(R.id.date44);
        driver44= findViewById(R.id.driver44);
        comment44= findViewById(R.id.comment44);
        s44= findViewById(R.id.s44);
        sm44= findViewById(R.id.sm44);
        name45=findViewById(R.id.name45);
        point45=findViewById(R.id.point45);
        Section45=findViewById(R.id.Section45);
        target45=findViewById(R.id.target45);
        team45=findViewById(R.id.team45);
        location45=findViewById(R.id.location45);
        tmael45= findViewById(R.id.tmael45);
        date45= findViewById(R.id.date45);
        driver45= findViewById(R.id.driver45);
        comment45= findViewById(R.id.comment45);
        s45= findViewById(R.id.s45);
        sm45= findViewById(R.id.sm45);
        name46=findViewById(R.id.name46);
        point46=findViewById(R.id.point46);
        Section46=findViewById(R.id.Section46);
        target46=findViewById(R.id.target46);
        team46=findViewById(R.id.team46);
        location46=findViewById(R.id.location46);
        tmael46= findViewById(R.id.tmael46);
        date46= findViewById(R.id.date46);
        driver46= findViewById(R.id.driver46);
        comment46= findViewById(R.id.comment46);
        s46= findViewById(R.id.s46);
        sm46= findViewById(R.id.sm46);
        name47=findViewById(R.id.name47);
        point47=findViewById(R.id.point47);
        Section47=findViewById(R.id.Section47);
        target47=findViewById(R.id.target47);
        team47=findViewById(R.id.team47);
        location47=findViewById(R.id.location47);
        tmael47= findViewById(R.id.tmael47);
        date47= findViewById(R.id.date47);
        driver47= findViewById(R.id.driver47);
        comment47= findViewById(R.id.comment47);
        s47= findViewById(R.id.s47);
        sm47= findViewById(R.id.sm47);
        name48=findViewById(R.id.name48);
        point48=findViewById(R.id.point48);
        Section48=findViewById(R.id.Section48);
        target48=findViewById(R.id.target48);
        team48=findViewById(R.id.team48);
        location48=findViewById(R.id.location48);
        tmael48= findViewById(R.id.tmael48);
        date48= findViewById(R.id.date48);
        driver48= findViewById(R.id.driver48);
        comment48= findViewById(R.id.comment48);
        s48= findViewById(R.id.s48);
        sm48= findViewById(R.id.sm48);
        name49=findViewById(R.id.name49);
        point49=findViewById(R.id.point49);
        Section49=findViewById(R.id.Section49);
        target49=findViewById(R.id.target49);
        team49=findViewById(R.id.team49);
        location49=findViewById(R.id.location49);
        tmael49= findViewById(R.id.tmael49);
        date49= findViewById(R.id.date49);
        driver49= findViewById(R.id.driver49);
        comment49= findViewById(R.id.comment49);
        s49= findViewById(R.id.s49);
        sm49= findViewById(R.id.sm49);
        name50=findViewById(R.id.name50);
        point50=findViewById(R.id.point50);
        Section50=findViewById(R.id.Section50);
        target50=findViewById(R.id.target50);
        team50=findViewById(R.id.team50);
        location50=findViewById(R.id.location50);
        tmael50= findViewById(R.id.tmael50);
        date50= findViewById(R.id.date50);
        driver50= findViewById(R.id.driver50);
        comment50= findViewById(R.id.comment50);
        s50= findViewById(R.id.s50);
        sm50= findViewById(R.id.sm50);
        name51=findViewById(R.id.name51);
        point51=findViewById(R.id.point51);
        Section51=findViewById(R.id.Section51);
        target51=findViewById(R.id.target51);
        team51=findViewById(R.id.team51);
        location51=findViewById(R.id.location51);
        tmael51= findViewById(R.id.tmael51);
        date51= findViewById(R.id.date51);
        driver51= findViewById(R.id.driver51);
        comment51= findViewById(R.id.comment51);
        s51= findViewById(R.id.s51);
        sm51= findViewById(R.id.sm51);
        name52=findViewById(R.id.name52);
        point52=findViewById(R.id.point52);
        Section52=findViewById(R.id.Section52);
        target52=findViewById(R.id.target52);
        team52=findViewById(R.id.team52);
        location52=findViewById(R.id.location52);
        tmael52= findViewById(R.id.tmael52);
        date52= findViewById(R.id.date52);
        driver52= findViewById(R.id.driver52);
        comment52= findViewById(R.id.comment52);
        s52= findViewById(R.id.s52);
        sm52= findViewById(R.id.sm52);
        name53=findViewById(R.id.name53);
        point53=findViewById(R.id.point53);
        Section53=findViewById(R.id.Section53);
        target53=findViewById(R.id.target53);
        team53=findViewById(R.id.team53);
        location53=findViewById(R.id.location53);
        tmael53= findViewById(R.id.tmael53);
        date53= findViewById(R.id.date53);
        driver53= findViewById(R.id.driver53);
        comment53= findViewById(R.id.comment53);
        s53= findViewById(R.id.s53);
        sm53= findViewById(R.id.sm53);
        name54=findViewById(R.id.name54);
        point54=findViewById(R.id.point54);
        Section54=findViewById(R.id.Section54);
        target54=findViewById(R.id.target54);
        team54=findViewById(R.id.team54);
        location54=findViewById(R.id.location54);
        tmael54= findViewById(R.id.tmael54);
        date54= findViewById(R.id.date54);
        driver54= findViewById(R.id.driver54);
        comment54= findViewById(R.id.comment54);
        s54= findViewById(R.id.s54);
        sm54= findViewById(R.id.sm54);
        name55=findViewById(R.id.name55);
        point55=findViewById(R.id.point55);
        Section55=findViewById(R.id.Section55);
        target55=findViewById(R.id.target55);
        team55=findViewById(R.id.team55);
        location55=findViewById(R.id.location55);
        tmael55= findViewById(R.id.tmael55);
        date55= findViewById(R.id.date55);
        driver55= findViewById(R.id.driver55);
        comment55= findViewById(R.id.comment55);
        s55= findViewById(R.id.s55);
        sm55= findViewById(R.id.sm55);
        name56=findViewById(R.id.name56);
        point56=findViewById(R.id.point56);
        Section56=findViewById(R.id.Section56);
        target56=findViewById(R.id.target56);
        team56=findViewById(R.id.team56);
        location56=findViewById(R.id.location56);
        tmael56= findViewById(R.id.tmael56);
        date56= findViewById(R.id.date56);
        driver56= findViewById(R.id.driver56);
        comment56= findViewById(R.id.comment56);
        s56= findViewById(R.id.s56);
        sm56= findViewById(R.id.sm56);
        name57=findViewById(R.id.name57);
        point57=findViewById(R.id.point57);
        Section57=findViewById(R.id.Section57);
        target57=findViewById(R.id.target57);
        team57=findViewById(R.id.team57);
        location57=findViewById(R.id.location57);
        tmael57= findViewById(R.id.tmael57);
        date57= findViewById(R.id.date57);
        driver57= findViewById(R.id.driver57);
        comment57= findViewById(R.id.comment57);
        s57= findViewById(R.id.s57);
        sm57= findViewById(R.id.sm57);
        name58=findViewById(R.id.name58);
        point58=findViewById(R.id.point58);
        Section58=findViewById(R.id.Section58);
        target58=findViewById(R.id.target58);
        team58=findViewById(R.id.team58);
        location58=findViewById(R.id.location58);
        tmael58= findViewById(R.id.tmael58);
        date58= findViewById(R.id.date58);
        driver58= findViewById(R.id.driver58);
        comment58= findViewById(R.id.comment58);
        s58= findViewById(R.id.s58);
        sm58= findViewById(R.id.sm58);
        name59=findViewById(R.id.name59);
        point59=findViewById(R.id.point59);
        Section59=findViewById(R.id.Section59);
        target59=findViewById(R.id.target59);
        team59=findViewById(R.id.team59);
        location59=findViewById(R.id.location59);
        tmael59= findViewById(R.id.tmael59);
        date59= findViewById(R.id.date59);
        driver59= findViewById(R.id.driver59);
        comment59= findViewById(R.id.comment59);
        s59= findViewById(R.id.s59);
        sm59= findViewById(R.id.sm59);
        name60=findViewById(R.id.name60);
        point60=findViewById(R.id.point60);
        Section60=findViewById(R.id.Section60);
        target60=findViewById(R.id.target60);
        team60=findViewById(R.id.team60);
        location60=findViewById(R.id.location60);
        tmael60= findViewById(R.id.tmael60);
        date60= findViewById(R.id.date60);
        driver60= findViewById(R.id.driver60);
        comment60= findViewById(R.id.comment60);
        s60= findViewById(R.id.s60);
        sm60= findViewById(R.id.sm60);
        name61=findViewById(R.id.name61);
        point61=findViewById(R.id.point61);
        Section61=findViewById(R.id.Section61);
        target61=findViewById(R.id.target61);
        team61=findViewById(R.id.team61);
        location61=findViewById(R.id.location61);
        tmael61= findViewById(R.id.tmael61);
        date61= findViewById(R.id.date61);
        driver61= findViewById(R.id.driver61);
        comment61= findViewById(R.id.comment61);
        s61= findViewById(R.id.s61);
        sm61= findViewById(R.id.sm61);
        name62=findViewById(R.id.name62);
        point62=findViewById(R.id.point62);
        Section62=findViewById(R.id.Section62);
        target62=findViewById(R.id.target62);
        team62=findViewById(R.id.team62);
        location62=findViewById(R.id.location62);
        tmael62= findViewById(R.id.tmael62);
        date62= findViewById(R.id.date62);
        driver62= findViewById(R.id.driver62);
        comment62= findViewById(R.id.comment62);
        s62= findViewById(R.id.s62);
        sm62= findViewById(R.id.sm62);
        name63=findViewById(R.id.name63);
        point63=findViewById(R.id.point63);
        Section63=findViewById(R.id.Section63);
        target63=findViewById(R.id.target63);
        team63=findViewById(R.id.team63);
        location63=findViewById(R.id.location63);
        tmael63= findViewById(R.id.tmael63);
        date63= findViewById(R.id.date63);
        driver63= findViewById(R.id.driver63);
        comment63= findViewById(R.id.comment63);
        s63= findViewById(R.id.s63);
        sm63= findViewById(R.id.sm63);
        name64=findViewById(R.id.name64);
        point64=findViewById(R.id.point64);
        Section64=findViewById(R.id.Section64);
        target64=findViewById(R.id.target64);
        team64=findViewById(R.id.team64);
        location64=findViewById(R.id.location64);
        tmael64= findViewById(R.id.tmael64);
        date64= findViewById(R.id.date64);
        driver64= findViewById(R.id.driver64);
        comment64= findViewById(R.id.comment64);
        s64= findViewById(R.id.s64);
        sm64= findViewById(R.id.sm64);
        name65=findViewById(R.id.name65);
        point65=findViewById(R.id.point65);
        Section65=findViewById(R.id.Section65);
        target65=findViewById(R.id.target65);
        team65=findViewById(R.id.team65);
        location65=findViewById(R.id.location65);
        tmael65= findViewById(R.id.tmael65);
        date65= findViewById(R.id.date65);
        driver65= findViewById(R.id.driver65);
        comment65= findViewById(R.id.comment65);
        s65= findViewById(R.id.s65);
        sm65= findViewById(R.id.sm65);
        name66=findViewById(R.id.name66);
        point66=findViewById(R.id.point66);
        Section66=findViewById(R.id.Section66);
        target66=findViewById(R.id.target66);
        team66=findViewById(R.id.team66);
        location66=findViewById(R.id.location66);
        tmael66= findViewById(R.id.tmael66);
        date66= findViewById(R.id.date66);
        driver66= findViewById(R.id.driver66);
        comment66= findViewById(R.id.comment66);
        s66= findViewById(R.id.s66);
        sm66= findViewById(R.id.sm66);
        name67=findViewById(R.id.name67);
        point67=findViewById(R.id.point67);
        Section67=findViewById(R.id.Section67);
        target67=findViewById(R.id.target67);
        team67=findViewById(R.id.team67);
        location67=findViewById(R.id.location67);
        tmael67= findViewById(R.id.tmael67);
        date67= findViewById(R.id.date67);
        driver67= findViewById(R.id.driver67);
        comment67= findViewById(R.id.comment67);
        s67= findViewById(R.id.s67);
        sm67= findViewById(R.id.sm67);
        name68=findViewById(R.id.name68);
        point68=findViewById(R.id.point68);
        Section68=findViewById(R.id.Section68);
        target68=findViewById(R.id.target68);
        team68=findViewById(R.id.team68);
        location68=findViewById(R.id.location68);
        tmael68= findViewById(R.id.tmael68);
        date68= findViewById(R.id.date68);
        driver68= findViewById(R.id.driver68);
        comment68= findViewById(R.id.comment68);
        s68= findViewById(R.id.s68);
        sm68= findViewById(R.id.sm68);
        name69=findViewById(R.id.name69);
        point69=findViewById(R.id.point69);
        Section69=findViewById(R.id.Section69);
        target69=findViewById(R.id.target69);
        team69=findViewById(R.id.team69);
        location69=findViewById(R.id.location69);
        tmael69= findViewById(R.id.tmael69);
        date69= findViewById(R.id.date69);
        driver69= findViewById(R.id.driver69);
        comment69= findViewById(R.id.comment69);
        s69= findViewById(R.id.s69);
        sm69= findViewById(R.id.sm69);
        name70=findViewById(R.id.name70);
        point70=findViewById(R.id.point70);
        Section70=findViewById(R.id.Section70);
        target70=findViewById(R.id.target70);
        team70=findViewById(R.id.team70);
        location70=findViewById(R.id.location70);
        tmael70= findViewById(R.id.tmael70);
        date70= findViewById(R.id.date70);
        driver70= findViewById(R.id.driver70);
        comment70= findViewById(R.id.comment70);
        s70= findViewById(R.id.s70);
        sm70= findViewById(R.id.sm70);
        name71=findViewById(R.id.name71);
        point71=findViewById(R.id.point71);
        Section71=findViewById(R.id.Section71);
        target71=findViewById(R.id.target71);
        team71=findViewById(R.id.team71);
        location71=findViewById(R.id.location71);
        tmael71= findViewById(R.id.tmael71);
        date71= findViewById(R.id.date71);
        driver71= findViewById(R.id.driver71);
        comment71= findViewById(R.id.comment71);
        s71= findViewById(R.id.s71);
        sm71= findViewById(R.id.sm71);
        name72=findViewById(R.id.name72);
        point72=findViewById(R.id.point72);
        Section72=findViewById(R.id.Section72);
        target72=findViewById(R.id.target72);
        team72=findViewById(R.id.team72);
        location72=findViewById(R.id.location72);
        tmael72= findViewById(R.id.tmael72);
        date72= findViewById(R.id.date72);
        driver72= findViewById(R.id.driver72);
        comment72= findViewById(R.id.comment72);
        s72= findViewById(R.id.s72);
        sm72= findViewById(R.id.sm72);
        name73=findViewById(R.id.name73);
        point73=findViewById(R.id.point73);
        Section73=findViewById(R.id.Section73);
        target73=findViewById(R.id.target73);
        team73=findViewById(R.id.team73);
        location73=findViewById(R.id.location73);
        tmael73= findViewById(R.id.tmael73);
        date73= findViewById(R.id.date73);
        driver73= findViewById(R.id.driver73);
        comment73= findViewById(R.id.comment73);
        s73= findViewById(R.id.s73);
        sm73= findViewById(R.id.sm73);
        name74=findViewById(R.id.name74);
        point74=findViewById(R.id.point74);
        Section74=findViewById(R.id.Section74);
        target74=findViewById(R.id.target74);
        team74=findViewById(R.id.team74);
        location74=findViewById(R.id.location74);
        tmael74= findViewById(R.id.tmael74);
        date74= findViewById(R.id.date74);
        driver74= findViewById(R.id.driver74);
        comment74= findViewById(R.id.comment74);
        s74= findViewById(R.id.s74);
        sm74= findViewById(R.id.sm74);
        name75=findViewById(R.id.name75);
        point75=findViewById(R.id.point75);
        Section75=findViewById(R.id.Section75);
        target75=findViewById(R.id.target75);
        team75=findViewById(R.id.team75);
        location75=findViewById(R.id.location75);
        tmael75= findViewById(R.id.tmael75);
        date75= findViewById(R.id.date75);
        driver75= findViewById(R.id.driver75);
        comment75= findViewById(R.id.comment75);
        s75= findViewById(R.id.s75);
        sm75= findViewById(R.id.sm75);
        name76=findViewById(R.id.name76);
        point76=findViewById(R.id.point76);
        Section76=findViewById(R.id.Section76);
        target76=findViewById(R.id.target76);
        team76=findViewById(R.id.team76);
        location76=findViewById(R.id.location76);
        tmael76= findViewById(R.id.tmael76);
        date76= findViewById(R.id.date76);
        driver76= findViewById(R.id.driver76);
        comment76= findViewById(R.id.comment76);
        s76= findViewById(R.id.s76);
        sm76= findViewById(R.id.sm76);
        name77=findViewById(R.id.name77);
        point77=findViewById(R.id.point77);
        Section77=findViewById(R.id.Section77);
        target77=findViewById(R.id.target77);
        team77=findViewById(R.id.team77);
        location77=findViewById(R.id.location77);
        tmael77= findViewById(R.id.tmael77);
        date77= findViewById(R.id.date77);
        driver77= findViewById(R.id.driver77);
        comment77= findViewById(R.id.comment77);
        s77= findViewById(R.id.s77);
        sm77= findViewById(R.id.sm77);
        name78=findViewById(R.id.name78);
        point78=findViewById(R.id.point78);
        Section78=findViewById(R.id.Section78);
        target78=findViewById(R.id.target78);
        team78=findViewById(R.id.team78);
        location78=findViewById(R.id.location78);
        tmael78= findViewById(R.id.tmael78);
        date78= findViewById(R.id.date78);
        driver78= findViewById(R.id.driver78);
        comment78= findViewById(R.id.comment78);
        s78= findViewById(R.id.s78);
        sm78= findViewById(R.id.sm78);
        name79=findViewById(R.id.name79);
        point79=findViewById(R.id.point79);
        Section79=findViewById(R.id.Section79);
        target79=findViewById(R.id.target79);
        team79=findViewById(R.id.team79);
        location79=findViewById(R.id.location79);
        tmael79= findViewById(R.id.tmael79);
        date79= findViewById(R.id.date79);
        driver79= findViewById(R.id.driver79);
        comment79= findViewById(R.id.comment79);
        s79= findViewById(R.id.s79);
        sm79= findViewById(R.id.sm79);
        name80=findViewById(R.id.name80);
        point80=findViewById(R.id.point80);
        Section80=findViewById(R.id.Section80);
        target80=findViewById(R.id.target80);
        team80=findViewById(R.id.team80);
        location80=findViewById(R.id.location80);
        tmael80= findViewById(R.id.tmael80);
        date80= findViewById(R.id.date80);
        driver80= findViewById(R.id.driver80);
        comment80= findViewById(R.id.comment80);
        s80= findViewById(R.id.s80);
        sm80= findViewById(R.id.sm80);
        name81=findViewById(R.id.name81);
        point81=findViewById(R.id.point81);
        Section81=findViewById(R.id.Section81);
        target81=findViewById(R.id.target81);
        team81=findViewById(R.id.team81);
        location81=findViewById(R.id.location81);
        tmael81= findViewById(R.id.tmael81);
        date81= findViewById(R.id.date81);
        driver81= findViewById(R.id.driver81);
        comment81= findViewById(R.id.comment81);
        s81= findViewById(R.id.s81);
        sm81= findViewById(R.id.sm81);
        name82=findViewById(R.id.name82);
        point82=findViewById(R.id.point82);
        Section82=findViewById(R.id.Section82);
        target82=findViewById(R.id.target82);
        team82=findViewById(R.id.team82);
        location82=findViewById(R.id.location82);
        tmael82= findViewById(R.id.tmael82);
        date82= findViewById(R.id.date82);
        driver82= findViewById(R.id.driver82);
        comment82= findViewById(R.id.comment82);
        s82= findViewById(R.id.s82);
        sm82= findViewById(R.id.sm82);
        name83=findViewById(R.id.name83);
        point83=findViewById(R.id.point83);
        Section83=findViewById(R.id.Section83);
        target83=findViewById(R.id.target83);
        team83=findViewById(R.id.team83);
        location83=findViewById(R.id.location83);
        tmael83= findViewById(R.id.tmael83);
        date83= findViewById(R.id.date83);
        driver83= findViewById(R.id.driver83);
        comment83= findViewById(R.id.comment83);
        s83= findViewById(R.id.s83);
        sm83= findViewById(R.id.sm83);
        name84=findViewById(R.id.name84);
        point84=findViewById(R.id.point84);
        Section84=findViewById(R.id.Section84);
        target84=findViewById(R.id.target84);
        team84=findViewById(R.id.team84);
        location84=findViewById(R.id.location84);
        tmael84= findViewById(R.id.tmael84);
        date84= findViewById(R.id.date84);
        driver84= findViewById(R.id.driver84);
        comment84= findViewById(R.id.comment84);
        s84= findViewById(R.id.s84);
        sm84= findViewById(R.id.sm84);
        name85=findViewById(R.id.name85);
        point85=findViewById(R.id.point85);
        Section85=findViewById(R.id.Section85);
        target85=findViewById(R.id.target85);
        team85=findViewById(R.id.team85);
        location85=findViewById(R.id.location85);
        tmael85= findViewById(R.id.tmael85);
        date85= findViewById(R.id.date85);
        driver85= findViewById(R.id.driver85);
        comment85= findViewById(R.id.comment85);
        s85= findViewById(R.id.s85);
        sm85= findViewById(R.id.sm85);
        name86=findViewById(R.id.name86);
        point86=findViewById(R.id.point86);
        Section86=findViewById(R.id.Section86);
        target86=findViewById(R.id.target86);
        team86=findViewById(R.id.team86);
        location86=findViewById(R.id.location86);
        tmael86= findViewById(R.id.tmael86);
        date86= findViewById(R.id.date86);
        driver86= findViewById(R.id.driver86);
        comment86= findViewById(R.id.comment86);
        s86= findViewById(R.id.s86);
        sm86= findViewById(R.id.sm86);
        name87=findViewById(R.id.name87);
        point87=findViewById(R.id.point87);
        Section87=findViewById(R.id.Section87);
        target87=findViewById(R.id.target87);
        team87=findViewById(R.id.team87);
        location87=findViewById(R.id.location87);
        tmael87= findViewById(R.id.tmael87);
        date87= findViewById(R.id.date87);
        driver87= findViewById(R.id.driver87);
        comment87= findViewById(R.id.comment87);
        s87= findViewById(R.id.s87);
        sm87= findViewById(R.id.sm87);
        name88=findViewById(R.id.name88);
        point88=findViewById(R.id.point88);
        Section88=findViewById(R.id.Section88);
        target88=findViewById(R.id.target88);
        team88=findViewById(R.id.team88);
        location88=findViewById(R.id.location88);
        tmael88= findViewById(R.id.tmael88);
        date88= findViewById(R.id.date88);
        driver88= findViewById(R.id.driver88);
        comment88= findViewById(R.id.comment88);
        s88= findViewById(R.id.s88);
        sm88= findViewById(R.id.sm88);
        name89=findViewById(R.id.name89);
        point89=findViewById(R.id.point89);
        Section89=findViewById(R.id.Section89);
        target89=findViewById(R.id.target89);
        team89=findViewById(R.id.team89);
        location89=findViewById(R.id.location89);
        tmael89= findViewById(R.id.tmael89);
        date89= findViewById(R.id.date89);
        driver89= findViewById(R.id.driver89);
        comment89= findViewById(R.id.comment89);
        s89= findViewById(R.id.s89);
        sm89= findViewById(R.id.sm89);
        name90=findViewById(R.id.name90);
        point90=findViewById(R.id.point90);
        Section90=findViewById(R.id.Section90);
        target90=findViewById(R.id.target90);
        team90=findViewById(R.id.team90);
        location90=findViewById(R.id.location90);
        tmael90= findViewById(R.id.tmael90);
        date90= findViewById(R.id.date90);
        driver90= findViewById(R.id.driver90);
        comment90= findViewById(R.id.comment90);
        s90= findViewById(R.id.s90);
        sm90= findViewById(R.id.sm90);
        name91=findViewById(R.id.name91);
        point91=findViewById(R.id.point91);
        Section91=findViewById(R.id.Section91);
        target91=findViewById(R.id.target91);
        team91=findViewById(R.id.team91);
        location91=findViewById(R.id.location91);
        tmael91= findViewById(R.id.tmael91);
        date91= findViewById(R.id.date91);
        driver91= findViewById(R.id.driver91);
        comment91= findViewById(R.id.comment91);
        s91= findViewById(R.id.s91);
        sm91= findViewById(R.id.sm91);
        name92=findViewById(R.id.name92);
        point92=findViewById(R.id.point92);
        Section92=findViewById(R.id.Section92);
        target92=findViewById(R.id.target92);
        team92=findViewById(R.id.team92);
        location92=findViewById(R.id.location92);
        tmael92= findViewById(R.id.tmael92);
        date92= findViewById(R.id.date92);
        driver92= findViewById(R.id.driver92);
        comment92= findViewById(R.id.comment92);
        s92= findViewById(R.id.s92);
        sm92= findViewById(R.id.sm92);
        name93=findViewById(R.id.name93);
        point93=findViewById(R.id.point93);
        Section93=findViewById(R.id.Section93);
        target93=findViewById(R.id.target93);
        team93=findViewById(R.id.team93);
        location93=findViewById(R.id.location93);
        tmael93= findViewById(R.id.tmael93);
        date93= findViewById(R.id.date93);
        driver93= findViewById(R.id.driver93);
        comment93= findViewById(R.id.comment93);
        s93= findViewById(R.id.s93);
        sm93= findViewById(R.id.sm93);
        name94=findViewById(R.id.name94);
        point94=findViewById(R.id.point94);
        Section94=findViewById(R.id.Section94);
        target94=findViewById(R.id.target94);
        team94=findViewById(R.id.team94);
        location94=findViewById(R.id.location94);
        tmael94= findViewById(R.id.tmael94);
        date94= findViewById(R.id.date94);
        driver94= findViewById(R.id.driver94);
        comment94= findViewById(R.id.comment94);
        s94= findViewById(R.id.s94);
        sm94= findViewById(R.id.sm94);
        name95=findViewById(R.id.name95);
        point95=findViewById(R.id.point95);
        Section95=findViewById(R.id.Section95);
        target95=findViewById(R.id.target95);
        team95=findViewById(R.id.team95);
        location95=findViewById(R.id.location95);
        tmael95= findViewById(R.id.tmael95);
        date95= findViewById(R.id.date95);
        driver95= findViewById(R.id.driver95);
        comment95= findViewById(R.id.comment95);
        s95= findViewById(R.id.s95);
        sm95= findViewById(R.id.sm95);
        name96=findViewById(R.id.name96);
        point96=findViewById(R.id.point96);
        Section96=findViewById(R.id.Section96);
        target96=findViewById(R.id.target96);
        team96=findViewById(R.id.team96);
        location96=findViewById(R.id.location96);
        tmael96= findViewById(R.id.tmael96);
        date96= findViewById(R.id.date96);
        driver96= findViewById(R.id.driver96);
        comment96= findViewById(R.id.comment96);
        s96= findViewById(R.id.s96);
        sm96= findViewById(R.id.sm96);
        name97=findViewById(R.id.name97);
        point97=findViewById(R.id.point97);
        Section97=findViewById(R.id.Section97);
        target97=findViewById(R.id.target97);
        team97=findViewById(R.id.team97);
        location97=findViewById(R.id.location97);
        tmael97= findViewById(R.id.tmael97);
        date97= findViewById(R.id.date97);
        driver97= findViewById(R.id.driver97);
        comment97= findViewById(R.id.comment97);
        s97= findViewById(R.id.s97);
        sm97= findViewById(R.id.sm97);
        name98=findViewById(R.id.name98);
        point98=findViewById(R.id.point98);
        Section98=findViewById(R.id.Section98);
        target98=findViewById(R.id.target98);
        team98=findViewById(R.id.team98);
        location98=findViewById(R.id.location98);
        tmael98= findViewById(R.id.tmael98);
        date98= findViewById(R.id.date98);
        driver98= findViewById(R.id.driver98);
        comment98= findViewById(R.id.comment98);
        s98= findViewById(R.id.s98);
        sm98= findViewById(R.id.sm98);
        name99=findViewById(R.id.name99);
        point99=findViewById(R.id.point99);
        Section99=findViewById(R.id.Section99);
        target99=findViewById(R.id.target99);
        team99=findViewById(R.id.team99);
        location99=findViewById(R.id.location99);
        tmael99= findViewById(R.id.tmael99);
        date99= findViewById(R.id.date99);
        driver99= findViewById(R.id.driver99);
        comment99= findViewById(R.id.comment99);
        s99= findViewById(R.id.s99);
        sm99= findViewById(R.id.sm99);
        name100=findViewById(R.id.name100);
        point100=findViewById(R.id.point100);
        Section100=findViewById(R.id.Section100);
        target100=findViewById(R.id.target100);
        team100=findViewById(R.id.team100);
        location100=findViewById(R.id.location100);
        tmael100= findViewById(R.id.tmael100);
        date100= findViewById(R.id.date100);
        driver100= findViewById(R.id.driver100);
        comment100= findViewById(R.id.comment100);
        s100= findViewById(R.id.s100);
        sm100= findViewById(R.id.sm100);
        name101=findViewById(R.id.name101);
        point101=findViewById(R.id.point101);
        Section101=findViewById(R.id.Section101);
        target101=findViewById(R.id.target101);
        team101=findViewById(R.id.team101);
        location101=findViewById(R.id.location101);
        tmael101= findViewById(R.id.tmael101);
        date101= findViewById(R.id.date101);
        driver101= findViewById(R.id.driver101);
        comment101= findViewById(R.id.comment101);
        s101= findViewById(R.id.s101);
        sm101= findViewById(R.id.sm101);
        name102=findViewById(R.id.name102);
        point102=findViewById(R.id.point102);
        Section102=findViewById(R.id.Section102);
        target102=findViewById(R.id.target102);
        team102=findViewById(R.id.team102);
        location102=findViewById(R.id.location102);
        tmael102= findViewById(R.id.tmael102);
        date102= findViewById(R.id.date102);
        driver102= findViewById(R.id.driver102);
        comment102= findViewById(R.id.comment102);
        s102= findViewById(R.id.s102);
        sm102= findViewById(R.id.sm102);
        name103=findViewById(R.id.name103);
        point103=findViewById(R.id.point103);
        Section103=findViewById(R.id.Section103);
        target103=findViewById(R.id.target103);
        team103=findViewById(R.id.team103);
        location103=findViewById(R.id.location103);
        tmael103= findViewById(R.id.tmael103);
        date103= findViewById(R.id.date103);
        driver103= findViewById(R.id.driver103);
        comment103= findViewById(R.id.comment103);
        s103= findViewById(R.id.s103);
        sm103= findViewById(R.id.sm103);
        name104=findViewById(R.id.name104);
        point104=findViewById(R.id.point104);
        Section104=findViewById(R.id.Section104);
        target104=findViewById(R.id.target104);
        team104=findViewById(R.id.team104);
        location104=findViewById(R.id.location104);
        tmael104= findViewById(R.id.tmael104);
        date104= findViewById(R.id.date104);
        driver104= findViewById(R.id.driver104);
        comment104= findViewById(R.id.comment104);
        s104= findViewById(R.id.s104);
        sm104= findViewById(R.id.sm104);
        name105=findViewById(R.id.name105);
        point105=findViewById(R.id.point105);
        Section105=findViewById(R.id.Section105);
        target105=findViewById(R.id.target105);
        team105=findViewById(R.id.team105);
        location105=findViewById(R.id.location105);
        tmael105= findViewById(R.id.tmael105);
        date105= findViewById(R.id.date105);
        driver105= findViewById(R.id.driver105);
        comment105= findViewById(R.id.comment105);
        s105= findViewById(R.id.s105);
        sm105= findViewById(R.id.sm105);
        name106=findViewById(R.id.name106);
        point106=findViewById(R.id.point106);
        Section106=findViewById(R.id.Section106);
        target106=findViewById(R.id.target106);
        team106=findViewById(R.id.team106);
        location106=findViewById(R.id.location106);
        tmael106= findViewById(R.id.tmael106);
        date106= findViewById(R.id.date106);
        driver106= findViewById(R.id.driver106);
        comment106= findViewById(R.id.comment106);
        s106= findViewById(R.id.s106);
        sm106= findViewById(R.id.sm106);
        name107=findViewById(R.id.name107);
        point107=findViewById(R.id.point107);
        Section107=findViewById(R.id.Section107);
        target107=findViewById(R.id.target107);
        team107=findViewById(R.id.team107);
        location107=findViewById(R.id.location107);
        tmael107= findViewById(R.id.tmael107);
        date107= findViewById(R.id.date107);
        driver107= findViewById(R.id.driver107);
        comment107= findViewById(R.id.comment107);
        s107= findViewById(R.id.s107);
        sm107= findViewById(R.id.sm107);
        name108=findViewById(R.id.name108);
        point108=findViewById(R.id.point108);
        Section108=findViewById(R.id.Section108);
        target108=findViewById(R.id.target108);
        team108=findViewById(R.id.team108);
        location108=findViewById(R.id.location108);
        tmael108= findViewById(R.id.tmael108);
        date108= findViewById(R.id.date108);
        driver108= findViewById(R.id.driver108);
        comment108= findViewById(R.id.comment108);
        s108= findViewById(R.id.s108);
        sm108= findViewById(R.id.sm108);
        name109=findViewById(R.id.name109);
        point109=findViewById(R.id.point109);
        Section109=findViewById(R.id.Section109);
        target109=findViewById(R.id.target109);
        team109=findViewById(R.id.team109);
        location109=findViewById(R.id.location109);
        tmael109= findViewById(R.id.tmael109);
        date109= findViewById(R.id.date109);
        driver109= findViewById(R.id.driver109);
        comment109= findViewById(R.id.comment109);
        s109= findViewById(R.id.s109);
        sm109= findViewById(R.id.sm109);
        name110=findViewById(R.id.name110);
        point110=findViewById(R.id.point110);
        Section110=findViewById(R.id.Section110);
        target110=findViewById(R.id.target110);
        team110=findViewById(R.id.team110);
        location110=findViewById(R.id.location110);
        tmael110= findViewById(R.id.tmael110);
        date110= findViewById(R.id.date110);
        driver110= findViewById(R.id.driver110);
        comment110= findViewById(R.id.comment110);
        s110= findViewById(R.id.s110);
        sm110= findViewById(R.id.sm110);
        name111=findViewById(R.id.name111);
        point111=findViewById(R.id.point111);
        Section111=findViewById(R.id.Section111);
        target111=findViewById(R.id.target111);
        team111=findViewById(R.id.team111);
        location111=findViewById(R.id.location111);
        tmael111= findViewById(R.id.tmael111);
        date111= findViewById(R.id.date111);
        driver111= findViewById(R.id.driver111);
        comment111= findViewById(R.id.comment111);
        s111= findViewById(R.id.s111);
        sm111= findViewById(R.id.sm111);
        name112=findViewById(R.id.name112);
        point112=findViewById(R.id.point112);
        Section112=findViewById(R.id.Section112);
        target112=findViewById(R.id.target112);
        team112=findViewById(R.id.team112);
        location112=findViewById(R.id.location112);
        tmael112= findViewById(R.id.tmael112);
        date112= findViewById(R.id.date112);
        driver112= findViewById(R.id.driver112);
        comment112= findViewById(R.id.comment112);
        s112= findViewById(R.id.s112);
        sm112= findViewById(R.id.sm112);
        name113=findViewById(R.id.name113);
        point113=findViewById(R.id.point113);
        Section113=findViewById(R.id.Section113);
        target113=findViewById(R.id.target113);
        team113=findViewById(R.id.team113);
        location113=findViewById(R.id.location113);
        tmael113= findViewById(R.id.tmael113);
        date113= findViewById(R.id.date113);
        driver113= findViewById(R.id.driver113);
        comment113= findViewById(R.id.comment113);
        s113= findViewById(R.id.s113);
        sm113= findViewById(R.id.sm113);
        name114=findViewById(R.id.name114);
        point114=findViewById(R.id.point114);
        Section114=findViewById(R.id.Section114);
        target114=findViewById(R.id.target114);
        team114=findViewById(R.id.team114);
        location114=findViewById(R.id.location114);
        tmael114= findViewById(R.id.tmael114);
        date114= findViewById(R.id.date114);
        driver114= findViewById(R.id.driver114);
        comment114= findViewById(R.id.comment114);
        s114= findViewById(R.id.s114);
        sm114= findViewById(R.id.sm114);
        name115=findViewById(R.id.name115);
        point115=findViewById(R.id.point115);
        Section115=findViewById(R.id.Section115);
        target115=findViewById(R.id.target115);
        team115=findViewById(R.id.team115);
        location115=findViewById(R.id.location115);
        tmael115= findViewById(R.id.tmael115);
        date115= findViewById(R.id.date115);
        driver115= findViewById(R.id.driver115);
        comment115= findViewById(R.id.comment115);
        s115= findViewById(R.id.s115);
        sm115= findViewById(R.id.sm115);
        name116=findViewById(R.id.name116);
        point116=findViewById(R.id.point116);
        Section116=findViewById(R.id.Section116);
        target116=findViewById(R.id.target116);
        team116=findViewById(R.id.team116);
        location116=findViewById(R.id.location116);
        tmael116= findViewById(R.id.tmael116);
        date116= findViewById(R.id.date116);
        driver116= findViewById(R.id.driver116);
        comment116= findViewById(R.id.comment116);
        s116= findViewById(R.id.s116);
        sm116= findViewById(R.id.sm116);
        name117=findViewById(R.id.name117);
        point117=findViewById(R.id.point117);
        Section117=findViewById(R.id.Section117);
        target117=findViewById(R.id.target117);
        team117=findViewById(R.id.team117);
        location117=findViewById(R.id.location117);
        tmael117= findViewById(R.id.tmael117);
        date117= findViewById(R.id.date117);
        driver117= findViewById(R.id.driver117);
        comment117= findViewById(R.id.comment117);
        s117= findViewById(R.id.s117);
        sm117= findViewById(R.id.sm117);
        name118=findViewById(R.id.name118);
        point118=findViewById(R.id.point118);
        Section118=findViewById(R.id.Section118);
        target118=findViewById(R.id.target118);
        team118=findViewById(R.id.team118);
        location118=findViewById(R.id.location118);
        tmael118= findViewById(R.id.tmael118);
        date118= findViewById(R.id.date118);
        driver118= findViewById(R.id.driver118);
        comment118= findViewById(R.id.comment118);
        s118= findViewById(R.id.s118);
        sm118= findViewById(R.id.sm118);
        name119=findViewById(R.id.name119);
        point119=findViewById(R.id.point119);
        Section119=findViewById(R.id.Section119);
        target119=findViewById(R.id.target119);
        team119=findViewById(R.id.team119);
        location119=findViewById(R.id.location119);
        tmael119= findViewById(R.id.tmael119);
        date119= findViewById(R.id.date119);
        driver119= findViewById(R.id.driver119);
        comment119= findViewById(R.id.comment119);
        s119= findViewById(R.id.s119);
        sm119= findViewById(R.id.sm119);
        name120=findViewById(R.id.name120);
        point120=findViewById(R.id.point120);
        Section120=findViewById(R.id.Section120);
        target120=findViewById(R.id.target120);
        team120=findViewById(R.id.team120);
        location120=findViewById(R.id.location120);
        tmael120= findViewById(R.id.tmael120);
        date120= findViewById(R.id.date120);
        driver120= findViewById(R.id.driver120);
        comment120= findViewById(R.id.comment120);
        s120= findViewById(R.id.s120);
        sm120= findViewById(R.id.sm120);
        name121=findViewById(R.id.name121);
        point121=findViewById(R.id.point121);
        Section121=findViewById(R.id.Section121);
        target121=findViewById(R.id.target121);
        team121=findViewById(R.id.team121);
        location121=findViewById(R.id.location121);
        tmael121= findViewById(R.id.tmael121);
        date121= findViewById(R.id.date121);
        driver121= findViewById(R.id.driver121);
        comment121= findViewById(R.id.comment121);
        s121= findViewById(R.id.s121);
        sm121= findViewById(R.id.sm121);
        name122=findViewById(R.id.name122);
        point122=findViewById(R.id.point122);
        Section122=findViewById(R.id.Section122);
        target122=findViewById(R.id.target122);
        team122=findViewById(R.id.team122);
        location122=findViewById(R.id.location122);
        tmael122= findViewById(R.id.tmael122);
        date122= findViewById(R.id.date122);
        driver122= findViewById(R.id.driver122);
        comment122= findViewById(R.id.comment122);
        s122= findViewById(R.id.s122);
        sm122= findViewById(R.id.sm122);
        name123=findViewById(R.id.name123);
        point123=findViewById(R.id.point123);
        Section123=findViewById(R.id.Section123);
        target123=findViewById(R.id.target123);
        team123=findViewById(R.id.team123);
        location123=findViewById(R.id.location123);
        tmael123= findViewById(R.id.tmael123);
        date123= findViewById(R.id.date123);
        driver123= findViewById(R.id.driver123);
        comment123= findViewById(R.id.comment123);
        s123= findViewById(R.id.s123);
        sm123= findViewById(R.id.sm123);
        name124=findViewById(R.id.name124);
        point124=findViewById(R.id.point124);
        Section124=findViewById(R.id.Section124);
        target124=findViewById(R.id.target124);
        team124=findViewById(R.id.team124);
        location124=findViewById(R.id.location124);
        tmael124= findViewById(R.id.tmael124);
        date124= findViewById(R.id.date124);
        driver124= findViewById(R.id.driver124);
        comment124= findViewById(R.id.comment124);
        s124= findViewById(R.id.s124);
        sm124= findViewById(R.id.sm124);
        name125=findViewById(R.id.name125);
        point125=findViewById(R.id.point125);
        Section125=findViewById(R.id.Section125);
        target125=findViewById(R.id.target125);
        team125=findViewById(R.id.team125);
        location125=findViewById(R.id.location125);
        tmael125= findViewById(R.id.tmael125);
        date125= findViewById(R.id.date125);
        driver125= findViewById(R.id.driver125);
        comment125= findViewById(R.id.comment125);
        s125= findViewById(R.id.s125);
        sm125= findViewById(R.id.sm125);
        name126=findViewById(R.id.name126);
        point126=findViewById(R.id.point126);
        Section126=findViewById(R.id.Section126);
        target126=findViewById(R.id.target126);
        team126=findViewById(R.id.team126);
        location126=findViewById(R.id.location126);
        tmael126= findViewById(R.id.tmael126);
        date126= findViewById(R.id.date126);
        driver126= findViewById(R.id.driver126);
        comment126= findViewById(R.id.comment126);
        s126= findViewById(R.id.s126);
        sm126= findViewById(R.id.sm126);
        name127=findViewById(R.id.name127);
        point127=findViewById(R.id.point127);
        Section127=findViewById(R.id.Section127);
        target127=findViewById(R.id.target127);
        team127=findViewById(R.id.team127);
        location127=findViewById(R.id.location127);
        tmael127= findViewById(R.id.tmael127);
        date127= findViewById(R.id.date127);
        driver127= findViewById(R.id.driver127);
        comment127= findViewById(R.id.comment127);
        s127= findViewById(R.id.s127);
        sm127= findViewById(R.id.sm127);
        name128=findViewById(R.id.name128);
        point128=findViewById(R.id.point128);
        Section128=findViewById(R.id.Section128);
        target128=findViewById(R.id.target128);
        team128=findViewById(R.id.team128);
        location128=findViewById(R.id.location128);
        tmael128= findViewById(R.id.tmael128);
        date128= findViewById(R.id.date128);
        driver128= findViewById(R.id.driver128);
        comment128= findViewById(R.id.comment128);
        s128= findViewById(R.id.s128);
        sm128= findViewById(R.id.sm128);
        name129=findViewById(R.id.name129);
        point129=findViewById(R.id.point129);
        Section129=findViewById(R.id.Section129);
        target129=findViewById(R.id.target129);
        team129=findViewById(R.id.team129);
        location129=findViewById(R.id.location129);
        tmael129= findViewById(R.id.tmael129);
        date129= findViewById(R.id.date129);
        driver129= findViewById(R.id.driver129);
        comment129= findViewById(R.id.comment129);
        s129= findViewById(R.id.s129);
        sm129= findViewById(R.id.sm129);
        name130=findViewById(R.id.name130);
        point130=findViewById(R.id.point130);
        Section130=findViewById(R.id.Section130);
        target130=findViewById(R.id.target130);
        team130=findViewById(R.id.team130);
        location130=findViewById(R.id.location130);
        tmael130= findViewById(R.id.tmael130);
        date130= findViewById(R.id.date130);
        driver130= findViewById(R.id.driver130);
        comment130= findViewById(R.id.comment130);
        s130= findViewById(R.id.s130);
        sm130= findViewById(R.id.sm130);
        name131=findViewById(R.id.name131);
        point131=findViewById(R.id.point131);
        Section131=findViewById(R.id.Section131);
        target131=findViewById(R.id.target131);
        team131=findViewById(R.id.team131);
        location131=findViewById(R.id.location131);
        tmael131= findViewById(R.id.tmael131);
        date131= findViewById(R.id.date131);
        driver131= findViewById(R.id.driver131);
        comment131= findViewById(R.id.comment131);
        s131= findViewById(R.id.s131);
        sm131= findViewById(R.id.sm131);
        name132=findViewById(R.id.name132);
        point132=findViewById(R.id.point132);
        Section132=findViewById(R.id.Section132);
        target132=findViewById(R.id.target132);
        team132=findViewById(R.id.team132);
        location132=findViewById(R.id.location132);
        tmael132= findViewById(R.id.tmael132);
        date132= findViewById(R.id.date132);
        driver132= findViewById(R.id.driver132);
        comment132= findViewById(R.id.comment132);
        s132= findViewById(R.id.s132);
        sm132= findViewById(R.id.sm132);
        name133=findViewById(R.id.name133);
        point133=findViewById(R.id.point133);
        Section133=findViewById(R.id.Section133);
        target133=findViewById(R.id.target133);
        team133=findViewById(R.id.team133);
        location133=findViewById(R.id.location133);
        tmael133= findViewById(R.id.tmael133);
        date133= findViewById(R.id.date133);
        driver133= findViewById(R.id.driver133);
        comment133= findViewById(R.id.comment133);
        s133= findViewById(R.id.s133);
        sm133= findViewById(R.id.sm133);
        name134=findViewById(R.id.name134);
        point134=findViewById(R.id.point134);
        Section134=findViewById(R.id.Section134);
        target134=findViewById(R.id.target134);
        team134=findViewById(R.id.team134);
        location134=findViewById(R.id.location134);
        tmael134= findViewById(R.id.tmael134);
        date134= findViewById(R.id.date134);
        driver134= findViewById(R.id.driver134);
        comment134= findViewById(R.id.comment134);
        s134= findViewById(R.id.s134);
        sm134= findViewById(R.id.sm134);
        name135=findViewById(R.id.name135);
        point135=findViewById(R.id.point135);
        Section135=findViewById(R.id.Section135);
        target135=findViewById(R.id.target135);
        team135=findViewById(R.id.team135);
        location135=findViewById(R.id.location135);
        tmael135= findViewById(R.id.tmael135);
        date135= findViewById(R.id.date135);
        driver135= findViewById(R.id.driver135);
        comment135= findViewById(R.id.comment135);
        s135= findViewById(R.id.s135);
        sm135= findViewById(R.id.sm135);
        name136=findViewById(R.id.name136);
        point136=findViewById(R.id.point136);
        Section136=findViewById(R.id.Section136);
        target136=findViewById(R.id.target136);
        team136=findViewById(R.id.team136);
        location136=findViewById(R.id.location136);
        tmael136= findViewById(R.id.tmael136);
        date136= findViewById(R.id.date136);
        driver136= findViewById(R.id.driver136);
        comment136= findViewById(R.id.comment136);
        s136= findViewById(R.id.s136);
        sm136= findViewById(R.id.sm136);
        name137=findViewById(R.id.name137);
        point137=findViewById(R.id.point137);
        Section137=findViewById(R.id.Section137);
        target137=findViewById(R.id.target137);
        team137=findViewById(R.id.team137);
        location137=findViewById(R.id.location137);
        tmael137= findViewById(R.id.tmael137);
        date137= findViewById(R.id.date137);
        driver137= findViewById(R.id.driver137);
        comment137= findViewById(R.id.comment137);
        s137= findViewById(R.id.s137);
        sm137= findViewById(R.id.sm137);
        name138=findViewById(R.id.name138);
        point138=findViewById(R.id.point138);
        Section138=findViewById(R.id.Section138);
        target138=findViewById(R.id.target138);
        team138=findViewById(R.id.team138);
        location138=findViewById(R.id.location138);
        tmael138= findViewById(R.id.tmael138);
        date138= findViewById(R.id.date138);
        driver138= findViewById(R.id.driver138);
        comment138= findViewById(R.id.comment138);
        s138= findViewById(R.id.s138);
        sm138= findViewById(R.id.sm138);
        name139=findViewById(R.id.name139);
        point139=findViewById(R.id.point139);
        Section139=findViewById(R.id.Section139);
        target139=findViewById(R.id.target139);
        team139=findViewById(R.id.team139);
        location139=findViewById(R.id.location139);
        tmael139= findViewById(R.id.tmael139);
        date139= findViewById(R.id.date139);
        driver139= findViewById(R.id.driver139);
        comment139= findViewById(R.id.comment139);
        s139= findViewById(R.id.s139);
        sm139= findViewById(R.id.sm139);
        name140=findViewById(R.id.name140);
        point140=findViewById(R.id.point140);
        Section140=findViewById(R.id.Section140);
        target140=findViewById(R.id.target140);
        team140=findViewById(R.id.team140);
        location140=findViewById(R.id.location140);
        tmael140= findViewById(R.id.tmael140);
        date140= findViewById(R.id.date140);
        driver140= findViewById(R.id.driver140);
        comment140= findViewById(R.id.comment140);
        s140= findViewById(R.id.s140);
        sm140= findViewById(R.id.sm140);
        name141=findViewById(R.id.name141);
        point141=findViewById(R.id.point141);
        Section141=findViewById(R.id.Section141);
        target141=findViewById(R.id.target141);
        team141=findViewById(R.id.team141);
        location141=findViewById(R.id.location141);
        tmael141= findViewById(R.id.tmael141);
        date141= findViewById(R.id.date141);
        driver141= findViewById(R.id.driver141);
        comment141= findViewById(R.id.comment141);
        s141= findViewById(R.id.s141);
        sm141= findViewById(R.id.sm141);
        name142=findViewById(R.id.name142);
        point142=findViewById(R.id.point142);
        Section142=findViewById(R.id.Section142);
        target142=findViewById(R.id.target142);
        team142=findViewById(R.id.team142);
        location142=findViewById(R.id.location142);
        tmael142= findViewById(R.id.tmael142);
        date142= findViewById(R.id.date142);
        driver142= findViewById(R.id.driver142);
        comment142= findViewById(R.id.comment142);
        s142= findViewById(R.id.s142);
        sm142= findViewById(R.id.sm142);
        name143=findViewById(R.id.name143);
        point143=findViewById(R.id.point143);
        Section143=findViewById(R.id.Section143);
        target143=findViewById(R.id.target143);
        team143=findViewById(R.id.team143);
        location143=findViewById(R.id.location143);
        tmael143= findViewById(R.id.tmael143);
        date143= findViewById(R.id.date143);
        driver143= findViewById(R.id.driver143);
        comment143= findViewById(R.id.comment143);
        s143= findViewById(R.id.s143);
        sm143= findViewById(R.id.sm143);
        name144=findViewById(R.id.name144);
        point144=findViewById(R.id.point144);
        Section144=findViewById(R.id.Section144);
        target144=findViewById(R.id.target144);
        team144=findViewById(R.id.team144);
        location144=findViewById(R.id.location144);
        tmael144= findViewById(R.id.tmael144);
        date144= findViewById(R.id.date144);
        driver144= findViewById(R.id.driver144);
        comment144= findViewById(R.id.comment144);
        s144= findViewById(R.id.s144);
        sm144= findViewById(R.id.sm144);
        name145=findViewById(R.id.name145);
        point145=findViewById(R.id.point145);
        Section145=findViewById(R.id.Section145);
        target145=findViewById(R.id.target145);
        team145=findViewById(R.id.team145);
        location145=findViewById(R.id.location145);
        tmael145= findViewById(R.id.tmael145);
        date145= findViewById(R.id.date145);
        driver145= findViewById(R.id.driver145);
        comment145= findViewById(R.id.comment145);
        s145= findViewById(R.id.s145);
        sm145= findViewById(R.id.sm145);
        name146=findViewById(R.id.name146);
        point146=findViewById(R.id.point146);
        Section146=findViewById(R.id.Section146);
        target146=findViewById(R.id.target146);
        team146=findViewById(R.id.team146);
        location146=findViewById(R.id.location146);
        tmael146= findViewById(R.id.tmael146);
        date146= findViewById(R.id.date146);
        driver146= findViewById(R.id.driver146);
        comment146= findViewById(R.id.comment146);
        s146= findViewById(R.id.s146);
        sm146= findViewById(R.id.sm146);
        name147=findViewById(R.id.name147);
        point147=findViewById(R.id.point147);
        Section147=findViewById(R.id.Section147);
        target147=findViewById(R.id.target147);
        team147=findViewById(R.id.team147);
        location147=findViewById(R.id.location147);
        tmael147= findViewById(R.id.tmael147);
        date147= findViewById(R.id.date147);
        driver147= findViewById(R.id.driver147);
        comment147= findViewById(R.id.comment147);
        s147= findViewById(R.id.s147);
        sm147= findViewById(R.id.sm147);
        name148=findViewById(R.id.name148);
        point148=findViewById(R.id.point148);
        Section148=findViewById(R.id.Section148);
        target148=findViewById(R.id.target148);
        team148=findViewById(R.id.team148);
        location148=findViewById(R.id.location148);
        tmael148= findViewById(R.id.tmael148);
        date148= findViewById(R.id.date148);
        driver148= findViewById(R.id.driver148);
        comment148= findViewById(R.id.comment148);
        s148= findViewById(R.id.s148);
        sm148= findViewById(R.id.sm148);
        name149=findViewById(R.id.name149);
        point149=findViewById(R.id.point149);
        Section149=findViewById(R.id.Section149);
        target149=findViewById(R.id.target149);
        team149=findViewById(R.id.team149);
        location149=findViewById(R.id.location149);
        tmael149= findViewById(R.id.tmael149);
        date149= findViewById(R.id.date149);
        driver149= findViewById(R.id.driver149);
        comment149= findViewById(R.id.comment149);
        s149= findViewById(R.id.s149);
        sm149= findViewById(R.id.sm149);
        name150=findViewById(R.id.name150);
        point150=findViewById(R.id.point150);
        Section150=findViewById(R.id.Section150);
        target150=findViewById(R.id.target150);
        team150=findViewById(R.id.team150);
        location150=findViewById(R.id.location150);
        tmael150= findViewById(R.id.tmael150);
        date150= findViewById(R.id.date150);
        driver150= findViewById(R.id.driver150);
        comment150= findViewById(R.id.comment150);
        s150= findViewById(R.id.s150);
        sm150= findViewById(R.id.sm150);
        name151=findViewById(R.id.name151);
        point151=findViewById(R.id.point151);
        Section151=findViewById(R.id.Section151);
        target151=findViewById(R.id.target151);
        team151=findViewById(R.id.team151);
        location151=findViewById(R.id.location151);
        tmael151= findViewById(R.id.tmael151);
        date151= findViewById(R.id.date151);
        driver151= findViewById(R.id.driver151);
        comment151= findViewById(R.id.comment151);
        s151= findViewById(R.id.s151);
        sm151= findViewById(R.id.sm151);
        name152=findViewById(R.id.name152);
        point152=findViewById(R.id.point152);
        Section152=findViewById(R.id.Section152);
        target152=findViewById(R.id.target152);
        team152=findViewById(R.id.team152);
        location152=findViewById(R.id.location152);
        tmael152= findViewById(R.id.tmael152);
        date152= findViewById(R.id.date152);
        driver152= findViewById(R.id.driver152);
        comment152= findViewById(R.id.comment152);
        s152= findViewById(R.id.s152);
        sm152= findViewById(R.id.sm152);
        name153=findViewById(R.id.name153);
        point153=findViewById(R.id.point153);
        Section153=findViewById(R.id.Section153);
        target153=findViewById(R.id.target153);
        team153=findViewById(R.id.team153);
        location153=findViewById(R.id.location153);
        tmael153= findViewById(R.id.tmael153);
        date153= findViewById(R.id.date153);
        driver153= findViewById(R.id.driver153);
        comment153= findViewById(R.id.comment153);
        s153= findViewById(R.id.s153);
        sm153= findViewById(R.id.sm153);
        name154=findViewById(R.id.name154);
        point154=findViewById(R.id.point154);
        Section154=findViewById(R.id.Section154);
        target154=findViewById(R.id.target154);
        team154=findViewById(R.id.team154);
        location154=findViewById(R.id.location154);
        tmael154= findViewById(R.id.tmael154);
        date154= findViewById(R.id.date154);
        driver154= findViewById(R.id.driver154);
        comment154= findViewById(R.id.comment154);
        s154= findViewById(R.id.s154);
        sm154= findViewById(R.id.sm154);
        name155=findViewById(R.id.name155);
        point155=findViewById(R.id.point155);
        Section155=findViewById(R.id.Section155);
        target155=findViewById(R.id.target155);
        team155=findViewById(R.id.team155);
        location155=findViewById(R.id.location155);
        tmael155= findViewById(R.id.tmael155);
        date155= findViewById(R.id.date155);
        driver155= findViewById(R.id.driver155);
        comment155= findViewById(R.id.comment155);
        s155= findViewById(R.id.s155);
        sm155= findViewById(R.id.sm155);
        name156=findViewById(R.id.name156);
        point156=findViewById(R.id.point156);
        Section156=findViewById(R.id.Section156);
        target156=findViewById(R.id.target156);
        team156=findViewById(R.id.team156);
        location156=findViewById(R.id.location156);
        tmael156= findViewById(R.id.tmael156);
        date156= findViewById(R.id.date156);
        driver156= findViewById(R.id.driver156);
        comment156= findViewById(R.id.comment156);
        s156= findViewById(R.id.s156);
        sm156= findViewById(R.id.sm156);
        name157=findViewById(R.id.name157);
        point157=findViewById(R.id.point157);
        Section157=findViewById(R.id.Section157);
        target157=findViewById(R.id.target157);
        team157=findViewById(R.id.team157);
        location157=findViewById(R.id.location157);
        tmael157= findViewById(R.id.tmael157);
        date157= findViewById(R.id.date157);
        driver157= findViewById(R.id.driver157);
        comment157= findViewById(R.id.comment157);
        s157= findViewById(R.id.s157);
        sm157= findViewById(R.id.sm157);
        name158=findViewById(R.id.name158);
        point158=findViewById(R.id.point158);
        Section158=findViewById(R.id.Section158);
        target158=findViewById(R.id.target158);
        team158=findViewById(R.id.team158);
        location158=findViewById(R.id.location158);
        tmael158= findViewById(R.id.tmael158);
        date158= findViewById(R.id.date158);
        driver158= findViewById(R.id.driver158);
        comment158= findViewById(R.id.comment158);
        s158= findViewById(R.id.s158);
        sm158= findViewById(R.id.sm158);
        name159=findViewById(R.id.name159);
        point159=findViewById(R.id.point159);
        Section159=findViewById(R.id.Section159);
        target159=findViewById(R.id.target159);
        team159=findViewById(R.id.team159);
        location159=findViewById(R.id.location159);
        tmael159= findViewById(R.id.tmael159);
        date159= findViewById(R.id.date159);
        driver159= findViewById(R.id.driver159);
        comment159= findViewById(R.id.comment159);
        s159= findViewById(R.id.s159);
        sm159= findViewById(R.id.sm159);
        name160=findViewById(R.id.name160);
        point160=findViewById(R.id.point160);
        Section160=findViewById(R.id.Section160);
        target160=findViewById(R.id.target160);
        team160=findViewById(R.id.team160);
        location160=findViewById(R.id.location160);
        tmael160= findViewById(R.id.tmael160);
        date160= findViewById(R.id.date160);
        driver160= findViewById(R.id.driver160);
        comment160= findViewById(R.id.comment160);
        s160= findViewById(R.id.s160);
        sm160= findViewById(R.id.sm160);
        name161=findViewById(R.id.name161);
        point161=findViewById(R.id.point161);
        Section161=findViewById(R.id.Section161);
        target161=findViewById(R.id.target161);
        team161=findViewById(R.id.team161);
        location161=findViewById(R.id.location161);
        tmael161= findViewById(R.id.tmael161);
        date161= findViewById(R.id.date161);
        driver161= findViewById(R.id.driver161);
        comment161= findViewById(R.id.comment161);
        s161= findViewById(R.id.s161);
        sm161= findViewById(R.id.sm161);
        name162=findViewById(R.id.name162);
        point162=findViewById(R.id.point162);
        Section162=findViewById(R.id.Section162);
        target162=findViewById(R.id.target162);
        team162=findViewById(R.id.team162);
        location162=findViewById(R.id.location162);
        tmael162= findViewById(R.id.tmael162);
        date162= findViewById(R.id.date162);
        driver162= findViewById(R.id.driver162);
        comment162= findViewById(R.id.comment162);
        s162= findViewById(R.id.s162);
        sm162= findViewById(R.id.sm162);
        name163=findViewById(R.id.name163);
        point163=findViewById(R.id.point163);
        Section163=findViewById(R.id.Section163);
        target163=findViewById(R.id.target163);
        team163=findViewById(R.id.team163);
        location163=findViewById(R.id.location163);
        tmael163= findViewById(R.id.tmael163);
        date163= findViewById(R.id.date163);
        driver163= findViewById(R.id.driver163);
        comment163= findViewById(R.id.comment163);
        s163= findViewById(R.id.s163);
        sm163= findViewById(R.id.sm163);
        name164=findViewById(R.id.name164);
        point164=findViewById(R.id.point164);
        Section164=findViewById(R.id.Section164);
        target164=findViewById(R.id.target164);
        team164=findViewById(R.id.team164);
        location164=findViewById(R.id.location164);
        tmael164= findViewById(R.id.tmael164);
        date164= findViewById(R.id.date164);
        driver164= findViewById(R.id.driver164);
        comment164= findViewById(R.id.comment164);
        s164= findViewById(R.id.s164);
        sm164= findViewById(R.id.sm164);
        name165=findViewById(R.id.name165);
        point165=findViewById(R.id.point165);
        Section165=findViewById(R.id.Section165);
        target165=findViewById(R.id.target165);
        team165=findViewById(R.id.team165);
        location165=findViewById(R.id.location165);
        tmael165= findViewById(R.id.tmael165);
        date165= findViewById(R.id.date165);
        driver165= findViewById(R.id.driver165);
        comment165= findViewById(R.id.comment165);
        s165= findViewById(R.id.s165);
        sm165= findViewById(R.id.sm165);
        name166=findViewById(R.id.name166);
        point166=findViewById(R.id.point166);
        Section166=findViewById(R.id.Section166);
        target166=findViewById(R.id.target166);
        team166=findViewById(R.id.team166);
        location166=findViewById(R.id.location166);
        tmael166= findViewById(R.id.tmael166);
        date166= findViewById(R.id.date166);
        driver166= findViewById(R.id.driver166);
        comment166= findViewById(R.id.comment166);
        s166= findViewById(R.id.s166);
        sm166= findViewById(R.id.sm166);
        name167=findViewById(R.id.name167);
        point167=findViewById(R.id.point167);
        Section167=findViewById(R.id.Section167);
        target167=findViewById(R.id.target167);
        team167=findViewById(R.id.team167);
        location167=findViewById(R.id.location167);
        tmael167= findViewById(R.id.tmael167);
        date167= findViewById(R.id.date167);
        driver167= findViewById(R.id.driver167);
        comment167= findViewById(R.id.comment167);
        s167= findViewById(R.id.s167);
        sm167= findViewById(R.id.sm167);
        name168=findViewById(R.id.name168);
        point168=findViewById(R.id.point168);
        Section168=findViewById(R.id.Section168);
        target168=findViewById(R.id.target168);
        team168=findViewById(R.id.team168);
        location168=findViewById(R.id.location168);
        tmael168= findViewById(R.id.tmael168);
        date168= findViewById(R.id.date168);
        driver168= findViewById(R.id.driver168);
        comment168= findViewById(R.id.comment168);
        s168= findViewById(R.id.s168);
        sm168= findViewById(R.id.sm168);
        name169=findViewById(R.id.name169);
        point169=findViewById(R.id.point169);
        Section169=findViewById(R.id.Section169);
        target169=findViewById(R.id.target169);
        team169=findViewById(R.id.team169);
        location169=findViewById(R.id.location169);
        tmael169= findViewById(R.id.tmael169);
        date169= findViewById(R.id.date169);
        driver169= findViewById(R.id.driver169);
        comment169= findViewById(R.id.comment169);
        s169= findViewById(R.id.s169);
        sm169= findViewById(R.id.sm169);
        name170=findViewById(R.id.name170);
        point170=findViewById(R.id.point170);
        Section170=findViewById(R.id.Section170);
        target170=findViewById(R.id.target170);
        team170=findViewById(R.id.team170);
        location170=findViewById(R.id.location170);
        tmael170= findViewById(R.id.tmael170);
        date170= findViewById(R.id.date170);
        driver170= findViewById(R.id.driver170);
        comment170= findViewById(R.id.comment170);
        s170= findViewById(R.id.s170);
        sm170= findViewById(R.id.sm170);
        name171=findViewById(R.id.name171);
        point171=findViewById(R.id.point171);
        Section171=findViewById(R.id.Section171);
        target171=findViewById(R.id.target171);
        team171=findViewById(R.id.team171);
        location171=findViewById(R.id.location171);
        tmael171= findViewById(R.id.tmael171);
        date171= findViewById(R.id.date171);
        driver171= findViewById(R.id.driver171);
        comment171= findViewById(R.id.comment171);
        s171= findViewById(R.id.s171);
        sm171= findViewById(R.id.sm171);
        name172=findViewById(R.id.name172);
        point172=findViewById(R.id.point172);
        Section172=findViewById(R.id.Section172);
        target172=findViewById(R.id.target172);
        team172=findViewById(R.id.team172);
        location172=findViewById(R.id.location172);
        tmael172= findViewById(R.id.tmael172);
        date172= findViewById(R.id.date172);
        driver172= findViewById(R.id.driver172);
        comment172= findViewById(R.id.comment172);
        s172= findViewById(R.id.s172);
        sm172= findViewById(R.id.sm172);
        name173=findViewById(R.id.name173);
        point173=findViewById(R.id.point173);
        Section173=findViewById(R.id.Section173);
        target173=findViewById(R.id.target173);
        team173=findViewById(R.id.team173);
        location173=findViewById(R.id.location173);
        tmael173= findViewById(R.id.tmael173);
        date173= findViewById(R.id.date173);
        driver173= findViewById(R.id.driver173);
        comment173= findViewById(R.id.comment173);
        s173= findViewById(R.id.s173);
        sm173= findViewById(R.id.sm173);
        name174=findViewById(R.id.name174);
        point174=findViewById(R.id.point174);
        Section174=findViewById(R.id.Section174);
        target174=findViewById(R.id.target174);
        team174=findViewById(R.id.team174);
        location174=findViewById(R.id.location174);
        tmael174= findViewById(R.id.tmael174);
        date174= findViewById(R.id.date174);
        driver174= findViewById(R.id.driver174);
        comment174= findViewById(R.id.comment174);
        s174= findViewById(R.id.s174);
        sm174= findViewById(R.id.sm174);
        name175=findViewById(R.id.name175);
        point175=findViewById(R.id.point175);
        Section175=findViewById(R.id.Section175);
        target175=findViewById(R.id.target175);
        team175=findViewById(R.id.team175);
        location175=findViewById(R.id.location175);
        tmael175= findViewById(R.id.tmael175);
        date175= findViewById(R.id.date175);
        driver175= findViewById(R.id.driver175);
        comment175= findViewById(R.id.comment175);
        s175= findViewById(R.id.s175);
        sm175= findViewById(R.id.sm175);
        name176=findViewById(R.id.name176);
        point176=findViewById(R.id.point176);
        Section176=findViewById(R.id.Section176);
        target176=findViewById(R.id.target176);
        team176=findViewById(R.id.team176);
        location176=findViewById(R.id.location176);
        tmael176= findViewById(R.id.tmael176);
        date176= findViewById(R.id.date176);
        driver176= findViewById(R.id.driver176);
        comment176= findViewById(R.id.comment176);
        s176= findViewById(R.id.s176);
        sm176= findViewById(R.id.sm176);
        name177=findViewById(R.id.name177);
        point177=findViewById(R.id.point177);
        Section177=findViewById(R.id.Section177);
        target177=findViewById(R.id.target177);
        team177=findViewById(R.id.team177);
        location177=findViewById(R.id.location177);
        tmael177= findViewById(R.id.tmael177);
        date177= findViewById(R.id.date177);
        driver177= findViewById(R.id.driver177);
        comment177= findViewById(R.id.comment177);
        s177= findViewById(R.id.s177);
        sm177= findViewById(R.id.sm177);
        name178=findViewById(R.id.name178);
        point178=findViewById(R.id.point178);
        Section178=findViewById(R.id.Section178);
        target178=findViewById(R.id.target178);
        team178=findViewById(R.id.team178);
        location178=findViewById(R.id.location178);
        tmael178= findViewById(R.id.tmael178);
        date178= findViewById(R.id.date178);
        driver178= findViewById(R.id.driver178);
        comment178= findViewById(R.id.comment178);
        s178= findViewById(R.id.s178);
        sm178= findViewById(R.id.sm178);
        name179=findViewById(R.id.name179);
        point179=findViewById(R.id.point179);
        Section179=findViewById(R.id.Section179);
        target179=findViewById(R.id.target179);
        team179=findViewById(R.id.team179);
        location179=findViewById(R.id.location179);
        tmael179= findViewById(R.id.tmael179);
        date179= findViewById(R.id.date179);
        driver179= findViewById(R.id.driver179);
        comment179= findViewById(R.id.comment179);
        s179= findViewById(R.id.s179);
        sm179= findViewById(R.id.sm179);
        name180=findViewById(R.id.name180);
        point180=findViewById(R.id.point180);
        Section180=findViewById(R.id.Section180);
        target180=findViewById(R.id.target180);
        team180=findViewById(R.id.team180);
        location180=findViewById(R.id.location180);
        tmael180= findViewById(R.id.tmael180);
        date180= findViewById(R.id.date180);
        driver180= findViewById(R.id.driver180);
        comment180= findViewById(R.id.comment180);
        s180= findViewById(R.id.s180);
        sm180= findViewById(R.id.sm180);
        name181=findViewById(R.id.name181);
        point181=findViewById(R.id.point181);
        Section181=findViewById(R.id.Section181);
        target181=findViewById(R.id.target181);
        team181=findViewById(R.id.team181);
        location181=findViewById(R.id.location181);
        tmael181= findViewById(R.id.tmael181);
        date181= findViewById(R.id.date181);
        driver181= findViewById(R.id.driver181);
        comment181= findViewById(R.id.comment181);
        s181= findViewById(R.id.s181);
        sm181= findViewById(R.id.sm181);
        name182=findViewById(R.id.name182);
        point182=findViewById(R.id.point182);
        Section182=findViewById(R.id.Section182);
        target182=findViewById(R.id.target182);
        team182=findViewById(R.id.team182);
        location182=findViewById(R.id.location182);
        tmael182= findViewById(R.id.tmael182);
        date182= findViewById(R.id.date182);
        driver182= findViewById(R.id.driver182);
        comment182= findViewById(R.id.comment182);
        s182= findViewById(R.id.s182);
        sm182= findViewById(R.id.sm182);
        name183=findViewById(R.id.name183);
        point183=findViewById(R.id.point183);
        Section183=findViewById(R.id.Section183);
        target183=findViewById(R.id.target183);
        team183=findViewById(R.id.team183);
        location183=findViewById(R.id.location183);
        tmael183= findViewById(R.id.tmael183);
        date183= findViewById(R.id.date183);
        driver183= findViewById(R.id.driver183);
        comment183= findViewById(R.id.comment183);
        s183= findViewById(R.id.s183);
        sm183= findViewById(R.id.sm183);
        name184=findViewById(R.id.name184);
        point184=findViewById(R.id.point184);
        Section184=findViewById(R.id.Section184);
        target184=findViewById(R.id.target184);
        team184=findViewById(R.id.team184);
        location184=findViewById(R.id.location184);
        tmael184= findViewById(R.id.tmael184);
        date184= findViewById(R.id.date184);
        driver184= findViewById(R.id.driver184);
        comment184= findViewById(R.id.comment184);
        s184= findViewById(R.id.s184);
        sm184= findViewById(R.id.sm184);
        name185=findViewById(R.id.name185);
        point185=findViewById(R.id.point185);
        Section185=findViewById(R.id.Section185);
        target185=findViewById(R.id.target185);
        team185=findViewById(R.id.team185);
        location185=findViewById(R.id.location185);
        tmael185= findViewById(R.id.tmael185);
        date185= findViewById(R.id.date185);
        driver185= findViewById(R.id.driver185);
        comment185= findViewById(R.id.comment185);
        s185= findViewById(R.id.s185);
        sm185= findViewById(R.id.sm185);
        name186=findViewById(R.id.name186);
        point186=findViewById(R.id.point186);
        Section186=findViewById(R.id.Section186);
        target186=findViewById(R.id.target186);
        team186=findViewById(R.id.team186);
        location186=findViewById(R.id.location186);
        tmael186= findViewById(R.id.tmael186);
        date186= findViewById(R.id.date186);
        driver186= findViewById(R.id.driver186);
        comment186= findViewById(R.id.comment186);
        s186= findViewById(R.id.s186);
        sm186= findViewById(R.id.sm186);
        name187=findViewById(R.id.name187);
        point187=findViewById(R.id.point187);
        Section187=findViewById(R.id.Section187);
        target187=findViewById(R.id.target187);
        team187=findViewById(R.id.team187);
        location187=findViewById(R.id.location187);
        tmael187= findViewById(R.id.tmael187);
        date187= findViewById(R.id.date187);
        driver187= findViewById(R.id.driver187);
        comment187= findViewById(R.id.comment187);
        s187= findViewById(R.id.s187);
        sm187= findViewById(R.id.sm187);
        name188=findViewById(R.id.name188);
        point188=findViewById(R.id.point188);
        Section188=findViewById(R.id.Section188);
        target188=findViewById(R.id.target188);
        team188=findViewById(R.id.team188);
        location188=findViewById(R.id.location188);
        tmael188= findViewById(R.id.tmael188);
        date188= findViewById(R.id.date188);
        driver188= findViewById(R.id.driver188);
        comment188= findViewById(R.id.comment188);
        s188= findViewById(R.id.s188);
        sm188= findViewById(R.id.sm188);
        name189=findViewById(R.id.name189);
        point189=findViewById(R.id.point189);
        Section189=findViewById(R.id.Section189);
        target189=findViewById(R.id.target189);
        team189=findViewById(R.id.team189);
        location189=findViewById(R.id.location189);
        tmael189= findViewById(R.id.tmael189);
        date189= findViewById(R.id.date189);
        driver189= findViewById(R.id.driver189);
        comment189= findViewById(R.id.comment189);
        s189= findViewById(R.id.s189);
        sm189= findViewById(R.id.sm189);
        name190=findViewById(R.id.name190);
        point190=findViewById(R.id.point190);
        Section190=findViewById(R.id.Section190);
        target190=findViewById(R.id.target190);
        team190=findViewById(R.id.team190);
        location190=findViewById(R.id.location190);
        tmael190= findViewById(R.id.tmael190);
        date190= findViewById(R.id.date190);
        driver190= findViewById(R.id.driver190);
        comment190= findViewById(R.id.comment190);
        s190= findViewById(R.id.s190);
        sm190= findViewById(R.id.sm190);
        name191=findViewById(R.id.name191);
        point191=findViewById(R.id.point191);
        Section191=findViewById(R.id.Section191);
        target191=findViewById(R.id.target191);
        team191=findViewById(R.id.team191);
        location191=findViewById(R.id.location191);
        tmael191= findViewById(R.id.tmael191);
        date191= findViewById(R.id.date191);
        driver191= findViewById(R.id.driver191);
        comment191= findViewById(R.id.comment191);
        s191= findViewById(R.id.s191);
        sm191= findViewById(R.id.sm191);
        name192=findViewById(R.id.name192);
        point192=findViewById(R.id.point192);
        Section192=findViewById(R.id.Section192);
        target192=findViewById(R.id.target192);
        team192=findViewById(R.id.team192);
        location192=findViewById(R.id.location192);
        tmael192= findViewById(R.id.tmael192);
        date192= findViewById(R.id.date192);
        driver192= findViewById(R.id.driver192);
        comment192= findViewById(R.id.comment192);
        s192= findViewById(R.id.s192);
        sm192= findViewById(R.id.sm192);
        name193=findViewById(R.id.name193);
        point193=findViewById(R.id.point193);
        Section193=findViewById(R.id.Section193);
        target193=findViewById(R.id.target193);
        team193=findViewById(R.id.team193);
        location193=findViewById(R.id.location193);
        tmael193= findViewById(R.id.tmael193);
        date193= findViewById(R.id.date193);
        driver193= findViewById(R.id.driver193);
        comment193= findViewById(R.id.comment193);
        s193= findViewById(R.id.s193);
        sm193= findViewById(R.id.sm193);
        name194=findViewById(R.id.name194);
        point194=findViewById(R.id.point194);
        Section194=findViewById(R.id.Section194);
        target194=findViewById(R.id.target194);
        team194=findViewById(R.id.team194);
        location194=findViewById(R.id.location194);
        tmael194= findViewById(R.id.tmael194);
        date194= findViewById(R.id.date194);
        driver194= findViewById(R.id.driver194);
        comment194= findViewById(R.id.comment194);
        s194= findViewById(R.id.s194);
        sm194= findViewById(R.id.sm194);
        name195=findViewById(R.id.name195);
        point195=findViewById(R.id.point195);
        Section195=findViewById(R.id.Section195);
        target195=findViewById(R.id.target195);
        team195=findViewById(R.id.team195);
        location195=findViewById(R.id.location195);
        tmael195= findViewById(R.id.tmael195);
        date195= findViewById(R.id.date195);
        driver195= findViewById(R.id.driver195);
        comment195= findViewById(R.id.comment195);
        s195= findViewById(R.id.s195);
        sm195= findViewById(R.id.sm195);
        name196=findViewById(R.id.name196);
        point196=findViewById(R.id.point196);
        Section196=findViewById(R.id.Section196);
        target196=findViewById(R.id.target196);
        team196=findViewById(R.id.team196);
        location196=findViewById(R.id.location196);
        tmael196= findViewById(R.id.tmael196);
        date196= findViewById(R.id.date196);
        driver196= findViewById(R.id.driver196);
        comment196= findViewById(R.id.comment196);
        s196= findViewById(R.id.s196);
        sm196= findViewById(R.id.sm196);
        name197=findViewById(R.id.name197);
        point197=findViewById(R.id.point197);
        Section197=findViewById(R.id.Section197);
        target197=findViewById(R.id.target197);
        team197=findViewById(R.id.team197);
        location197=findViewById(R.id.location197);
        tmael197= findViewById(R.id.tmael197);
        date197= findViewById(R.id.date197);
        driver197= findViewById(R.id.driver197);
        comment197= findViewById(R.id.comment197);
        s197= findViewById(R.id.s197);
        sm197= findViewById(R.id.sm197);
        name198=findViewById(R.id.name198);
        point198=findViewById(R.id.point198);
        Section198=findViewById(R.id.Section198);
        target198=findViewById(R.id.target198);
        team198=findViewById(R.id.team198);
        location198=findViewById(R.id.location198);
        tmael198= findViewById(R.id.tmael198);
        date198= findViewById(R.id.date198);
        driver198= findViewById(R.id.driver198);
        comment198= findViewById(R.id.comment198);
        s198= findViewById(R.id.s198);
        sm198= findViewById(R.id.sm198);
        name199=findViewById(R.id.name199);
        point199=findViewById(R.id.point199);
        Section199=findViewById(R.id.Section199);
        target199=findViewById(R.id.target199);
        team199=findViewById(R.id.team199);
        location199=findViewById(R.id.location199);
        tmael199= findViewById(R.id.tmael199);
        date199= findViewById(R.id.date199);
        driver199= findViewById(R.id.driver199);
        comment199= findViewById(R.id.comment199);
        s199= findViewById(R.id.s199);
        sm199= findViewById(R.id.sm199);
        name200=findViewById(R.id.name200);
        point200=findViewById(R.id.point200);
        Section200=findViewById(R.id.Section200);
        target200=findViewById(R.id.target200);
        team200=findViewById(R.id.team200);
        location200=findViewById(R.id.location200);
        tmael200= findViewById(R.id.tmael200);
        date200= findViewById(R.id.date200);
        driver200= findViewById(R.id.driver200);
        comment200= findViewById(R.id.comment200);
        s200= findViewById(R.id.s200);
        sm200= findViewById(R.id.sm200);
        name201=findViewById(R.id.name201);
        point201=findViewById(R.id.point201);
        Section201=findViewById(R.id.Section201);
        target201=findViewById(R.id.target201);
        team201=findViewById(R.id.team201);
        location201=findViewById(R.id.location201);
        tmael201= findViewById(R.id.tmael201);
        date201= findViewById(R.id.date201);
        driver201= findViewById(R.id.driver201);
        comment201= findViewById(R.id.comment201);
        s201= findViewById(R.id.s201);
        sm201= findViewById(R.id.sm201);
        name202=findViewById(R.id.name202);
        point202=findViewById(R.id.point202);
        Section202=findViewById(R.id.Section202);
        target202=findViewById(R.id.target202);
        team202=findViewById(R.id.team202);
        location202=findViewById(R.id.location202);
        tmael202= findViewById(R.id.tmael202);
        date202= findViewById(R.id.date202);
        driver202= findViewById(R.id.driver202);
        comment202= findViewById(R.id.comment202);
        s202= findViewById(R.id.s202);
        sm202= findViewById(R.id.sm202);
        name203=findViewById(R.id.name203);
        point203=findViewById(R.id.point203);
        Section203=findViewById(R.id.Section203);
        target203=findViewById(R.id.target203);
        team203=findViewById(R.id.team203);
        location203=findViewById(R.id.location203);
        tmael203= findViewById(R.id.tmael203);
        date203= findViewById(R.id.date203);
        driver203= findViewById(R.id.driver203);
        comment203= findViewById(R.id.comment203);
        s203= findViewById(R.id.s203);
        sm203= findViewById(R.id.sm203);
        name204=findViewById(R.id.name204);
        point204=findViewById(R.id.point204);
        Section204=findViewById(R.id.Section204);
        target204=findViewById(R.id.target204);
        team204=findViewById(R.id.team204);
        location204=findViewById(R.id.location204);
        tmael204= findViewById(R.id.tmael204);
        date204= findViewById(R.id.date204);
        driver204= findViewById(R.id.driver204);
        comment204= findViewById(R.id.comment204);
        s204= findViewById(R.id.s204);
        sm204= findViewById(R.id.sm204);
        name205=findViewById(R.id.name205);
        point205=findViewById(R.id.point205);
        Section205=findViewById(R.id.Section205);
        target205=findViewById(R.id.target205);
        team205=findViewById(R.id.team205);
        location205=findViewById(R.id.location205);
        tmael205= findViewById(R.id.tmael205);
        date205= findViewById(R.id.date205);
        driver205= findViewById(R.id.driver205);
        comment205= findViewById(R.id.comment205);
        s205= findViewById(R.id.s205);
        sm205= findViewById(R.id.sm205);
        name206=findViewById(R.id.name206);
        point206=findViewById(R.id.point206);
        Section206=findViewById(R.id.Section206);
        target206=findViewById(R.id.target206);
        team206=findViewById(R.id.team206);
        location206=findViewById(R.id.location206);
        tmael206= findViewById(R.id.tmael206);
        date206= findViewById(R.id.date206);
        driver206= findViewById(R.id.driver206);
        comment206= findViewById(R.id.comment206);
        s206= findViewById(R.id.s206);
        sm206= findViewById(R.id.sm206);
        name207=findViewById(R.id.name207);
        point207=findViewById(R.id.point207);
        Section207=findViewById(R.id.Section207);
        target207=findViewById(R.id.target207);
        team207=findViewById(R.id.team207);
        location207=findViewById(R.id.location207);
        tmael207= findViewById(R.id.tmael207);
        date207= findViewById(R.id.date207);
        driver207= findViewById(R.id.driver207);
        comment207= findViewById(R.id.comment207);
        s207= findViewById(R.id.s207);
        sm207= findViewById(R.id.sm207);
        name208=findViewById(R.id.name208);
        point208=findViewById(R.id.point208);
        Section208=findViewById(R.id.Section208);
        target208=findViewById(R.id.target208);
        team208=findViewById(R.id.team208);
        location208=findViewById(R.id.location208);
        tmael208= findViewById(R.id.tmael208);
        date208= findViewById(R.id.date208);
        driver208= findViewById(R.id.driver208);
        comment208= findViewById(R.id.comment208);
        s208= findViewById(R.id.s208);
        sm208= findViewById(R.id.sm208);
        name209=findViewById(R.id.name209);
        point209=findViewById(R.id.point209);
        Section209=findViewById(R.id.Section209);
        target209=findViewById(R.id.target209);
        team209=findViewById(R.id.team209);
        location209=findViewById(R.id.location209);
        tmael209= findViewById(R.id.tmael209);
        date209= findViewById(R.id.date209);
        driver209= findViewById(R.id.driver209);
        comment209= findViewById(R.id.comment209);
        s209= findViewById(R.id.s209);
        sm209= findViewById(R.id.sm209);
        name210=findViewById(R.id.name210);
        point210=findViewById(R.id.point210);
        Section210=findViewById(R.id.Section210);
        target210=findViewById(R.id.target210);
        team210=findViewById(R.id.team210);
        location210=findViewById(R.id.location210);
        tmael210= findViewById(R.id.tmael210);
        date210= findViewById(R.id.date210);
        driver210= findViewById(R.id.driver210);
        comment210= findViewById(R.id.comment210);
        s210= findViewById(R.id.s210);
        sm210= findViewById(R.id.sm210);
        name211=findViewById(R.id.name211);
        point211=findViewById(R.id.point211);
        Section211=findViewById(R.id.Section211);
        target211=findViewById(R.id.target211);
        team211=findViewById(R.id.team211);
        location211=findViewById(R.id.location211);
        tmael211= findViewById(R.id.tmael211);
        date211= findViewById(R.id.date211);
        driver211= findViewById(R.id.driver211);
        comment211= findViewById(R.id.comment211);
        s211= findViewById(R.id.s211);
        sm211= findViewById(R.id.sm211);
        name212=findViewById(R.id.name212);
        point212=findViewById(R.id.point212);
        Section212=findViewById(R.id.Section212);
        target212=findViewById(R.id.target212);
        team212=findViewById(R.id.team212);
        location212=findViewById(R.id.location212);
        tmael212= findViewById(R.id.tmael212);
        date212= findViewById(R.id.date212);
        driver212= findViewById(R.id.driver212);
        comment212= findViewById(R.id.comment212);
        s212= findViewById(R.id.s212);
        sm212= findViewById(R.id.sm212);
        name213=findViewById(R.id.name213);
        point213=findViewById(R.id.point213);
        Section213=findViewById(R.id.Section213);
        target213=findViewById(R.id.target213);
        team213=findViewById(R.id.team213);
        location213=findViewById(R.id.location213);
        tmael213= findViewById(R.id.tmael213);
        date213= findViewById(R.id.date213);
        driver213= findViewById(R.id.driver213);
        comment213= findViewById(R.id.comment213);
        s213= findViewById(R.id.s213);
        sm213= findViewById(R.id.sm213);
        name214=findViewById(R.id.name214);
        point214=findViewById(R.id.point214);
        Section214=findViewById(R.id.Section214);
        target214=findViewById(R.id.target214);
        team214=findViewById(R.id.team214);
        location214=findViewById(R.id.location214);
        tmael214= findViewById(R.id.tmael214);
        date214= findViewById(R.id.date214);
        driver214= findViewById(R.id.driver214);
        comment214= findViewById(R.id.comment214);
        s214= findViewById(R.id.s214);
        sm214= findViewById(R.id.sm214);
        name215=findViewById(R.id.name215);
        point215=findViewById(R.id.point215);
        Section215=findViewById(R.id.Section215);
        target215=findViewById(R.id.target215);
        team215=findViewById(R.id.team215);
        location215=findViewById(R.id.location215);
        tmael215= findViewById(R.id.tmael215);
        date215= findViewById(R.id.date215);
        driver215= findViewById(R.id.driver215);
        comment215= findViewById(R.id.comment215);
        s215= findViewById(R.id.s215);
        sm215= findViewById(R.id.sm215);
        name216=findViewById(R.id.name216);
        point216=findViewById(R.id.point216);
        Section216=findViewById(R.id.Section216);
        target216=findViewById(R.id.target216);
        team216=findViewById(R.id.team216);
        location216=findViewById(R.id.location216);
        tmael216= findViewById(R.id.tmael216);
        date216= findViewById(R.id.date216);
        driver216= findViewById(R.id.driver216);
        comment216= findViewById(R.id.comment216);
        s216= findViewById(R.id.s216);
        sm216= findViewById(R.id.sm216);
        name217=findViewById(R.id.name217);
        point217=findViewById(R.id.point217);
        Section217=findViewById(R.id.Section217);
        target217=findViewById(R.id.target217);
        team217=findViewById(R.id.team217);
        location217=findViewById(R.id.location217);
        tmael217= findViewById(R.id.tmael217);
        date217= findViewById(R.id.date217);
        driver217= findViewById(R.id.driver217);
        comment217= findViewById(R.id.comment217);
        s217= findViewById(R.id.s217);
        sm217= findViewById(R.id.sm217);
        name218=findViewById(R.id.name218);
        point218=findViewById(R.id.point218);
        Section218=findViewById(R.id.Section218);
        target218=findViewById(R.id.target218);
        team218=findViewById(R.id.team218);
        location218=findViewById(R.id.location218);
        tmael218= findViewById(R.id.tmael218);
        date218= findViewById(R.id.date218);
        driver218= findViewById(R.id.driver218);
        comment218= findViewById(R.id.comment218);
        s218= findViewById(R.id.s218);
        sm218= findViewById(R.id.sm218);
        name219=findViewById(R.id.name219);
        point219=findViewById(R.id.point219);
        Section219=findViewById(R.id.Section219);
        target219=findViewById(R.id.target219);
        team219=findViewById(R.id.team219);
        location219=findViewById(R.id.location219);
        tmael219= findViewById(R.id.tmael219);
        date219= findViewById(R.id.date219);
        driver219= findViewById(R.id.driver219);
        comment219= findViewById(R.id.comment219);
        s219= findViewById(R.id.s219);
        sm219= findViewById(R.id.sm219);
        name220=findViewById(R.id.name220);
        point220=findViewById(R.id.point220);
        Section220=findViewById(R.id.Section220);
        target220=findViewById(R.id.target220);
        team220=findViewById(R.id.team220);
        location220=findViewById(R.id.location220);
        tmael220= findViewById(R.id.tmael220);
        date220= findViewById(R.id.date220);
        driver220= findViewById(R.id.driver220);
        comment220= findViewById(R.id.comment220);
        s220= findViewById(R.id.s220);
        sm220= findViewById(R.id.sm220);
        name221=findViewById(R.id.name221);
        point221=findViewById(R.id.point221);
        Section221=findViewById(R.id.Section221);
        target221=findViewById(R.id.target221);
        team221=findViewById(R.id.team221);
        location221=findViewById(R.id.location221);
        tmael221= findViewById(R.id.tmael221);
        date221= findViewById(R.id.date221);
        driver221= findViewById(R.id.driver221);
        comment221= findViewById(R.id.comment221);
        s221= findViewById(R.id.s221);
        sm221= findViewById(R.id.sm221);
        name222=findViewById(R.id.name222);
        point222=findViewById(R.id.point222);
        Section222=findViewById(R.id.Section222);
        target222=findViewById(R.id.target222);
        team222=findViewById(R.id.team222);
        location222=findViewById(R.id.location222);
        tmael222= findViewById(R.id.tmael222);
        date222= findViewById(R.id.date222);
        driver222= findViewById(R.id.driver222);
        comment222= findViewById(R.id.comment222);
        s222= findViewById(R.id.s222);
        sm222= findViewById(R.id.sm222);
        name223=findViewById(R.id.name223);
        point223=findViewById(R.id.point223);
        Section223=findViewById(R.id.Section223);
        target223=findViewById(R.id.target223);
        team223=findViewById(R.id.team223);
        location223=findViewById(R.id.location223);
        tmael223= findViewById(R.id.tmael223);
        date223= findViewById(R.id.date223);
        driver223= findViewById(R.id.driver223);
        comment223= findViewById(R.id.comment223);
        s223= findViewById(R.id.s223);
        sm223= findViewById(R.id.sm223);
        name224=findViewById(R.id.name224);
        point224=findViewById(R.id.point224);
        Section224=findViewById(R.id.Section224);
        target224=findViewById(R.id.target224);
        team224=findViewById(R.id.team224);
        location224=findViewById(R.id.location224);
        tmael224= findViewById(R.id.tmael224);
        date224= findViewById(R.id.date224);
        driver224= findViewById(R.id.driver224);
        comment224= findViewById(R.id.comment224);
        s224= findViewById(R.id.s224);
        sm224= findViewById(R.id.sm224);
        name225=findViewById(R.id.name225);
        point225=findViewById(R.id.point225);
        Section225=findViewById(R.id.Section225);
        target225=findViewById(R.id.target225);
        team225=findViewById(R.id.team225);
        location225=findViewById(R.id.location225);
        tmael225= findViewById(R.id.tmael225);
        date225= findViewById(R.id.date225);
        driver225= findViewById(R.id.driver225);
        comment225= findViewById(R.id.comment225);
        s225= findViewById(R.id.s225);
        sm225= findViewById(R.id.sm225);
        name226=findViewById(R.id.name226);
        point226=findViewById(R.id.point226);
        Section226=findViewById(R.id.Section226);
        target226=findViewById(R.id.target226);
        team226=findViewById(R.id.team226);
        location226=findViewById(R.id.location226);
        tmael226= findViewById(R.id.tmael226);
        date226= findViewById(R.id.date226);
        driver226= findViewById(R.id.driver226);
        comment226= findViewById(R.id.comment226);
        s226= findViewById(R.id.s226);
        sm226= findViewById(R.id.sm226);
        name227=findViewById(R.id.name227);
        point227=findViewById(R.id.point227);
        Section227=findViewById(R.id.Section227);
        target227=findViewById(R.id.target227);
        team227=findViewById(R.id.team227);
        location227=findViewById(R.id.location227);
        tmael227= findViewById(R.id.tmael227);
        date227= findViewById(R.id.date227);
        driver227= findViewById(R.id.driver227);
        comment227= findViewById(R.id.comment227);
        s227= findViewById(R.id.s227);
        sm227= findViewById(R.id.sm227);
        name228=findViewById(R.id.name228);
        point228=findViewById(R.id.point228);
        Section228=findViewById(R.id.Section228);
        target228=findViewById(R.id.target228);
        team228=findViewById(R.id.team228);
        location228=findViewById(R.id.location228);
        tmael228= findViewById(R.id.tmael228);
        date228= findViewById(R.id.date228);
        driver228= findViewById(R.id.driver228);
        comment228= findViewById(R.id.comment228);
        s228= findViewById(R.id.s228);
        sm228= findViewById(R.id.sm228);
        name229=findViewById(R.id.name229);
        point229=findViewById(R.id.point229);
        Section229=findViewById(R.id.Section229);
        target229=findViewById(R.id.target229);
        team229=findViewById(R.id.team229);
        location229=findViewById(R.id.location229);
        tmael229= findViewById(R.id.tmael229);
        date229= findViewById(R.id.date229);
        driver229= findViewById(R.id.driver229);
        comment229= findViewById(R.id.comment229);
        s229= findViewById(R.id.s229);
        sm229= findViewById(R.id.sm229);
        name230=findViewById(R.id.name230);
        point230=findViewById(R.id.point230);
        Section230=findViewById(R.id.Section230);
        target230=findViewById(R.id.target230);
        team230=findViewById(R.id.team230);
        location230=findViewById(R.id.location230);
        tmael230= findViewById(R.id.tmael230);
        date230= findViewById(R.id.date230);
        driver230= findViewById(R.id.driver230);
        comment230= findViewById(R.id.comment230);
        s230= findViewById(R.id.s230);
        sm230= findViewById(R.id.sm230);
        name231=findViewById(R.id.name231);
        point231=findViewById(R.id.point231);
        Section231=findViewById(R.id.Section231);
        target231=findViewById(R.id.target231);
        team231=findViewById(R.id.team231);
        location231=findViewById(R.id.location231);
        tmael231= findViewById(R.id.tmael231);
        date231= findViewById(R.id.date231);
        driver231= findViewById(R.id.driver231);
        comment231= findViewById(R.id.comment231);
        s231= findViewById(R.id.s231);
        sm231= findViewById(R.id.sm231);
        name232=findViewById(R.id.name232);
        point232=findViewById(R.id.point232);
        Section232=findViewById(R.id.Section232);
        target232=findViewById(R.id.target232);
        team232=findViewById(R.id.team232);
        location232=findViewById(R.id.location232);
        tmael232= findViewById(R.id.tmael232);
        date232= findViewById(R.id.date232);
        driver232= findViewById(R.id.driver232);
        comment232= findViewById(R.id.comment232);
        s232= findViewById(R.id.s232);
        sm232= findViewById(R.id.sm232);
        name233=findViewById(R.id.name233);
        point233=findViewById(R.id.point233);
        Section233=findViewById(R.id.Section233);
        target233=findViewById(R.id.target233);
        team233=findViewById(R.id.team233);
        location233=findViewById(R.id.location233);
        tmael233= findViewById(R.id.tmael233);
        date233= findViewById(R.id.date233);
        driver233= findViewById(R.id.driver233);
        comment233= findViewById(R.id.comment233);
        s233= findViewById(R.id.s233);
        sm233= findViewById(R.id.sm233);
        name234=findViewById(R.id.name234);
        point234=findViewById(R.id.point234);
        Section234=findViewById(R.id.Section234);
        target234=findViewById(R.id.target234);
        team234=findViewById(R.id.team234);
        location234=findViewById(R.id.location234);
        tmael234= findViewById(R.id.tmael234);
        date234= findViewById(R.id.date234);
        driver234= findViewById(R.id.driver234);
        comment234= findViewById(R.id.comment234);
        s234= findViewById(R.id.s234);
        sm234= findViewById(R.id.sm234);
        name235=findViewById(R.id.name235);
        point235=findViewById(R.id.point235);
        Section235=findViewById(R.id.Section235);
        target235=findViewById(R.id.target235);
        team235=findViewById(R.id.team235);
        location235=findViewById(R.id.location235);
        tmael235= findViewById(R.id.tmael235);
        date235= findViewById(R.id.date235);
        driver235= findViewById(R.id.driver235);
        comment235= findViewById(R.id.comment235);
        s235= findViewById(R.id.s235);
        sm235= findViewById(R.id.sm235);
        name236=findViewById(R.id.name236);
        point236=findViewById(R.id.point236);
        Section236=findViewById(R.id.Section236);
        target236=findViewById(R.id.target236);
        team236=findViewById(R.id.team236);
        location236=findViewById(R.id.location236);
        tmael236= findViewById(R.id.tmael236);
        date236= findViewById(R.id.date236);
        driver236= findViewById(R.id.driver236);
        comment236= findViewById(R.id.comment236);
        s236= findViewById(R.id.s236);
        sm236= findViewById(R.id.sm236);
        name237=findViewById(R.id.name237);
        point237=findViewById(R.id.point237);
        Section237=findViewById(R.id.Section237);
        target237=findViewById(R.id.target237);
        team237=findViewById(R.id.team237);
        location237=findViewById(R.id.location237);
        tmael237= findViewById(R.id.tmael237);
        date237= findViewById(R.id.date237);
        driver237= findViewById(R.id.driver237);
        comment237= findViewById(R.id.comment237);
        s237= findViewById(R.id.s237);
        sm237= findViewById(R.id.sm237);
        name238=findViewById(R.id.name238);
        point238=findViewById(R.id.point238);
        Section238=findViewById(R.id.Section238);
        target238=findViewById(R.id.target238);
        team238=findViewById(R.id.team238);
        location238=findViewById(R.id.location238);
        tmael238= findViewById(R.id.tmael238);
        date238= findViewById(R.id.date238);
        driver238= findViewById(R.id.driver238);
        comment238= findViewById(R.id.comment238);
        s238= findViewById(R.id.s238);
        sm238= findViewById(R.id.sm238);
        name239=findViewById(R.id.name239);
        point239=findViewById(R.id.point239);
        Section239=findViewById(R.id.Section239);
        target239=findViewById(R.id.target239);
        team239=findViewById(R.id.team239);
        location239=findViewById(R.id.location239);
        tmael239= findViewById(R.id.tmael239);
        date239= findViewById(R.id.date239);
        driver239= findViewById(R.id.driver239);
        comment239= findViewById(R.id.comment239);
        s239= findViewById(R.id.s239);
        sm239= findViewById(R.id.sm239);
        name240=findViewById(R.id.name240);
        point240=findViewById(R.id.point240);
        Section240=findViewById(R.id.Section240);
        target240=findViewById(R.id.target240);
        team240=findViewById(R.id.team240);
        location240=findViewById(R.id.location240);
        tmael240= findViewById(R.id.tmael240);
        date240= findViewById(R.id.date240);
        driver240= findViewById(R.id.driver240);
        comment240= findViewById(R.id.comment240);
        s240= findViewById(R.id.s240);
        sm240= findViewById(R.id.sm240);
        name241=findViewById(R.id.name241);
        point241=findViewById(R.id.point241);
        Section241=findViewById(R.id.Section241);
        target241=findViewById(R.id.target241);
        team241=findViewById(R.id.team241);
        location241=findViewById(R.id.location241);
        tmael241= findViewById(R.id.tmael241);
        date241= findViewById(R.id.date241);
        driver241= findViewById(R.id.driver241);
        comment241= findViewById(R.id.comment241);
        s241= findViewById(R.id.s241);
        sm241= findViewById(R.id.sm241);
        name242=findViewById(R.id.name242);
        point242=findViewById(R.id.point242);
        Section242=findViewById(R.id.Section242);
        target242=findViewById(R.id.target242);
        team242=findViewById(R.id.team242);
        location242=findViewById(R.id.location242);
        tmael242= findViewById(R.id.tmael242);
        date242= findViewById(R.id.date242);
        driver242= findViewById(R.id.driver242);
        comment242= findViewById(R.id.comment242);
        s242= findViewById(R.id.s242);
        sm242= findViewById(R.id.sm242);
        name243=findViewById(R.id.name243);
        point243=findViewById(R.id.point243);
        Section243=findViewById(R.id.Section243);
        target243=findViewById(R.id.target243);
        team243=findViewById(R.id.team243);
        location243=findViewById(R.id.location243);
        tmael243= findViewById(R.id.tmael243);
        date243= findViewById(R.id.date243);
        driver243= findViewById(R.id.driver243);
        comment243= findViewById(R.id.comment243);
        s243= findViewById(R.id.s243);
        sm243= findViewById(R.id.sm243);
        name244=findViewById(R.id.name244);
        point244=findViewById(R.id.point244);
        Section244=findViewById(R.id.Section244);
        target244=findViewById(R.id.target244);
        team244=findViewById(R.id.team244);
        location244=findViewById(R.id.location244);
        tmael244= findViewById(R.id.tmael244);
        date244= findViewById(R.id.date244);
        driver244= findViewById(R.id.driver244);
        comment244= findViewById(R.id.comment244);
        s244= findViewById(R.id.s244);
        sm244= findViewById(R.id.sm244);
        name245=findViewById(R.id.name245);
        point245=findViewById(R.id.point245);
        Section245=findViewById(R.id.Section245);
        target245=findViewById(R.id.target245);
        team245=findViewById(R.id.team245);
        location245=findViewById(R.id.location245);
        tmael245= findViewById(R.id.tmael245);
        date245= findViewById(R.id.date245);
        driver245= findViewById(R.id.driver245);
        comment245= findViewById(R.id.comment245);
        s245= findViewById(R.id.s245);
        sm245= findViewById(R.id.sm245);
        name246=findViewById(R.id.name246);
        point246=findViewById(R.id.point246);
        Section246=findViewById(R.id.Section246);
        target246=findViewById(R.id.target246);
        team246=findViewById(R.id.team246);
        location246=findViewById(R.id.location246);
        tmael246= findViewById(R.id.tmael246);
        date246= findViewById(R.id.date246);
        driver246= findViewById(R.id.driver246);
        comment246= findViewById(R.id.comment246);
        s246= findViewById(R.id.s246);
        sm246= findViewById(R.id.sm246);
        name247=findViewById(R.id.name247);
        point247=findViewById(R.id.point247);
        Section247=findViewById(R.id.Section247);
        target247=findViewById(R.id.target247);
        team247=findViewById(R.id.team247);
        location247=findViewById(R.id.location247);
        tmael247= findViewById(R.id.tmael247);
        date247= findViewById(R.id.date247);
        driver247= findViewById(R.id.driver247);
        comment247= findViewById(R.id.comment247);
        s247= findViewById(R.id.s247);
        sm247= findViewById(R.id.sm247);
        name248=findViewById(R.id.name248);
        point248=findViewById(R.id.point248);
        Section248=findViewById(R.id.Section248);
        target248=findViewById(R.id.target248);
        team248=findViewById(R.id.team248);
        location248=findViewById(R.id.location248);
        tmael248= findViewById(R.id.tmael248);
        date248= findViewById(R.id.date248);
        driver248= findViewById(R.id.driver248);
        comment248= findViewById(R.id.comment248);
        s248= findViewById(R.id.s248);
        sm248= findViewById(R.id.sm248);
        name249=findViewById(R.id.name249);
        point249=findViewById(R.id.point249);
        Section249=findViewById(R.id.Section249);
        target249=findViewById(R.id.target249);
        team249=findViewById(R.id.team249);
        location249=findViewById(R.id.location249);
        tmael249= findViewById(R.id.tmael249);
        date249= findViewById(R.id.date249);
        driver249= findViewById(R.id.driver249);
        comment249= findViewById(R.id.comment249);
        s249= findViewById(R.id.s249);
        sm249= findViewById(R.id.sm249);
        name250=findViewById(R.id.name250);
        point250=findViewById(R.id.point250);
        Section250=findViewById(R.id.Section250);
        target250=findViewById(R.id.target250);
        team250=findViewById(R.id.team250);
        location250=findViewById(R.id.location250);
        tmael250= findViewById(R.id.tmael250);
        date250= findViewById(R.id.date250);
        driver250= findViewById(R.id.driver250);
        comment250= findViewById(R.id.comment250);
        s250= findViewById(R.id.s250);
        sm250= findViewById(R.id.sm250);
        name251=findViewById(R.id.name251);
        point251=findViewById(R.id.point251);
        Section251=findViewById(R.id.Section251);
        target251=findViewById(R.id.target251);
        team251=findViewById(R.id.team251);
        location251=findViewById(R.id.location251);
        tmael251= findViewById(R.id.tmael251);
        date251= findViewById(R.id.date251);
        driver251= findViewById(R.id.driver251);
        comment251= findViewById(R.id.comment251);
        s251= findViewById(R.id.s251);
        sm251= findViewById(R.id.sm251);
        name252=findViewById(R.id.name252);
        point252=findViewById(R.id.point252);
        Section252=findViewById(R.id.Section252);
        target252=findViewById(R.id.target252);
        team252=findViewById(R.id.team252);
        location252=findViewById(R.id.location252);
        tmael252= findViewById(R.id.tmael252);
        date252= findViewById(R.id.date252);
        driver252= findViewById(R.id.driver252);
        comment252= findViewById(R.id.comment252);
        s252= findViewById(R.id.s252);
        sm252= findViewById(R.id.sm252);
        name253=findViewById(R.id.name253);
        point253=findViewById(R.id.point253);
        Section253=findViewById(R.id.Section253);
        target253=findViewById(R.id.target253);
        team253=findViewById(R.id.team253);
        location253=findViewById(R.id.location253);
        tmael253= findViewById(R.id.tmael253);
        date253= findViewById(R.id.date253);
        driver253= findViewById(R.id.driver253);
        comment253= findViewById(R.id.comment253);
        s253= findViewById(R.id.s253);
        sm253= findViewById(R.id.sm253);
        name254=findViewById(R.id.name254);
        point254=findViewById(R.id.point254);
        Section254=findViewById(R.id.Section254);
        target254=findViewById(R.id.target254);
        team254=findViewById(R.id.team254);
        location254=findViewById(R.id.location254);
        tmael254= findViewById(R.id.tmael254);
        date254= findViewById(R.id.date254);
        driver254= findViewById(R.id.driver254);
        comment254= findViewById(R.id.comment254);
        s254= findViewById(R.id.s254);
        sm254= findViewById(R.id.sm254);
        name255=findViewById(R.id.name255);
        point255=findViewById(R.id.point255);
        Section255=findViewById(R.id.Section255);
        target255=findViewById(R.id.target255);
        team255=findViewById(R.id.team255);
        location255=findViewById(R.id.location255);
        tmael255= findViewById(R.id.tmael255);
        date255= findViewById(R.id.date255);
        driver255= findViewById(R.id.driver255);
        comment255= findViewById(R.id.comment255);
        s255= findViewById(R.id.s255);
        sm255= findViewById(R.id.sm255);
        name256=findViewById(R.id.name256);
        point256=findViewById(R.id.point256);
        Section256=findViewById(R.id.Section256);
        target256=findViewById(R.id.target256);
        team256=findViewById(R.id.team256);
        location256=findViewById(R.id.location256);
        tmael256= findViewById(R.id.tmael256);
        date256= findViewById(R.id.date256);
        driver256= findViewById(R.id.driver256);
        comment256= findViewById(R.id.comment256);
        s256= findViewById(R.id.s256);
        sm256= findViewById(R.id.sm256);
        name257=findViewById(R.id.name257);
        point257=findViewById(R.id.point257);
        Section257=findViewById(R.id.Section257);
        target257=findViewById(R.id.target257);
        team257=findViewById(R.id.team257);
        location257=findViewById(R.id.location257);
        tmael257= findViewById(R.id.tmael257);
        date257= findViewById(R.id.date257);
        driver257= findViewById(R.id.driver257);
        comment257= findViewById(R.id.comment257);
        s257= findViewById(R.id.s257);
        sm257= findViewById(R.id.sm257);
        name258=findViewById(R.id.name258);
        point258=findViewById(R.id.point258);
        Section258=findViewById(R.id.Section258);
        target258=findViewById(R.id.target258);
        team258=findViewById(R.id.team258);
        location258=findViewById(R.id.location258);
        tmael258= findViewById(R.id.tmael258);
        date258= findViewById(R.id.date258);
        driver258= findViewById(R.id.driver258);
        comment258= findViewById(R.id.comment258);
        s258= findViewById(R.id.s258);
        sm258= findViewById(R.id.sm258);
        name259=findViewById(R.id.name259);
        point259=findViewById(R.id.point259);
        Section259=findViewById(R.id.Section259);
        target259=findViewById(R.id.target259);
        team259=findViewById(R.id.team259);
        location259=findViewById(R.id.location259);
        tmael259= findViewById(R.id.tmael259);
        date259= findViewById(R.id.date259);
        driver259= findViewById(R.id.driver259);
        comment259= findViewById(R.id.comment259);
        s259= findViewById(R.id.s259);
        sm259= findViewById(R.id.sm259);
        name260=findViewById(R.id.name260);
        point260=findViewById(R.id.point260);
        Section260=findViewById(R.id.Section260);
        target260=findViewById(R.id.target260);
        team260=findViewById(R.id.team260);
        location260=findViewById(R.id.location260);
        tmael260= findViewById(R.id.tmael260);
        date260= findViewById(R.id.date260);
        driver260= findViewById(R.id.driver260);
        comment260= findViewById(R.id.comment260);
        s260= findViewById(R.id.s260);
        sm260= findViewById(R.id.sm260);
        name261=findViewById(R.id.name261);
        point261=findViewById(R.id.point261);
        Section261=findViewById(R.id.Section261);
        target261=findViewById(R.id.target261);
        team261=findViewById(R.id.team261);
        location261=findViewById(R.id.location261);
        tmael261= findViewById(R.id.tmael261);
        date261= findViewById(R.id.date261);
        driver261= findViewById(R.id.driver261);
        comment261= findViewById(R.id.comment261);
        s261= findViewById(R.id.s261);
        sm261= findViewById(R.id.sm261);
        name262=findViewById(R.id.name262);
        point262=findViewById(R.id.point262);
        Section262=findViewById(R.id.Section262);
        target262=findViewById(R.id.target262);
        team262=findViewById(R.id.team262);
        location262=findViewById(R.id.location262);
        tmael262= findViewById(R.id.tmael262);
        date262= findViewById(R.id.date262);
        driver262= findViewById(R.id.driver262);
        comment262= findViewById(R.id.comment262);
        s262= findViewById(R.id.s262);
        sm262= findViewById(R.id.sm262);
        name263=findViewById(R.id.name263);
        point263=findViewById(R.id.point263);
        Section263=findViewById(R.id.Section263);
        target263=findViewById(R.id.target263);
        team263=findViewById(R.id.team263);
        location263=findViewById(R.id.location263);
        tmael263= findViewById(R.id.tmael263);
        date263= findViewById(R.id.date263);
        driver263= findViewById(R.id.driver263);
        comment263= findViewById(R.id.comment263);
        s263= findViewById(R.id.s263);
        sm263= findViewById(R.id.sm263);
        name264=findViewById(R.id.name264);
        point264=findViewById(R.id.point264);
        Section264=findViewById(R.id.Section264);
        target264=findViewById(R.id.target264);
        team264=findViewById(R.id.team264);
        location264=findViewById(R.id.location264);
        tmael264= findViewById(R.id.tmael264);
        date264= findViewById(R.id.date264);
        driver264= findViewById(R.id.driver264);
        comment264= findViewById(R.id.comment264);
        s264= findViewById(R.id.s264);
        sm264= findViewById(R.id.sm264);
        name265=findViewById(R.id.name265);
        point265=findViewById(R.id.point265);
        Section265=findViewById(R.id.Section265);
        target265=findViewById(R.id.target265);
        team265=findViewById(R.id.team265);
        location265=findViewById(R.id.location265);
        tmael265= findViewById(R.id.tmael265);
        date265= findViewById(R.id.date265);
        driver265= findViewById(R.id.driver265);
        comment265= findViewById(R.id.comment265);
        s265= findViewById(R.id.s265);
        sm265= findViewById(R.id.sm265);
        name266=findViewById(R.id.name266);
        point266=findViewById(R.id.point266);
        Section266=findViewById(R.id.Section266);
        target266=findViewById(R.id.target266);
        team266=findViewById(R.id.team266);
        location266=findViewById(R.id.location266);
        tmael266= findViewById(R.id.tmael266);
        date266= findViewById(R.id.date266);
        driver266= findViewById(R.id.driver266);
        comment266= findViewById(R.id.comment266);
        s266= findViewById(R.id.s266);
        sm266= findViewById(R.id.sm266);
        name267=findViewById(R.id.name267);
        point267=findViewById(R.id.point267);
        Section267=findViewById(R.id.Section267);
        target267=findViewById(R.id.target267);
        team267=findViewById(R.id.team267);
        location267=findViewById(R.id.location267);
        tmael267= findViewById(R.id.tmael267);
        date267= findViewById(R.id.date267);
        driver267= findViewById(R.id.driver267);
        comment267= findViewById(R.id.comment267);
        s267= findViewById(R.id.s267);
        sm267= findViewById(R.id.sm267);
        name268=findViewById(R.id.name268);
        point268=findViewById(R.id.point268);
        Section268=findViewById(R.id.Section268);
        target268=findViewById(R.id.target268);
        team268=findViewById(R.id.team268);
        location268=findViewById(R.id.location268);
        tmael268= findViewById(R.id.tmael268);
        date268= findViewById(R.id.date268);
        driver268= findViewById(R.id.driver268);
        comment268= findViewById(R.id.comment268);
        s268= findViewById(R.id.s268);
        sm268= findViewById(R.id.sm268);
        name269=findViewById(R.id.name269);
        point269=findViewById(R.id.point269);
        Section269=findViewById(R.id.Section269);
        target269=findViewById(R.id.target269);
        team269=findViewById(R.id.team269);
        location269=findViewById(R.id.location269);
        tmael269= findViewById(R.id.tmael269);
        date269= findViewById(R.id.date269);
        driver269= findViewById(R.id.driver269);
        comment269= findViewById(R.id.comment269);
        s269= findViewById(R.id.s269);
        sm269= findViewById(R.id.sm269);
        name270=findViewById(R.id.name270);
        point270=findViewById(R.id.point270);
        Section270=findViewById(R.id.Section270);
        target270=findViewById(R.id.target270);
        team270=findViewById(R.id.team270);
        location270=findViewById(R.id.location270);
        tmael270= findViewById(R.id.tmael270);
        date270= findViewById(R.id.date270);
        driver270= findViewById(R.id.driver270);
        comment270= findViewById(R.id.comment270);
        s270= findViewById(R.id.s270);
        sm270= findViewById(R.id.sm270);
        name271=findViewById(R.id.name271);
        point271=findViewById(R.id.point271);
        Section271=findViewById(R.id.Section271);
        target271=findViewById(R.id.target271);
        team271=findViewById(R.id.team271);
        location271=findViewById(R.id.location271);
        tmael271= findViewById(R.id.tmael271);
        date271= findViewById(R.id.date271);
        driver271= findViewById(R.id.driver271);
        comment271= findViewById(R.id.comment271);
        s271= findViewById(R.id.s271);
        sm271= findViewById(R.id.sm271);
        name272=findViewById(R.id.name272);
        point272=findViewById(R.id.point272);
        Section272=findViewById(R.id.Section272);
        target272=findViewById(R.id.target272);
        team272=findViewById(R.id.team272);
        location272=findViewById(R.id.location272);
        tmael272= findViewById(R.id.tmael272);
        date272= findViewById(R.id.date272);
        driver272= findViewById(R.id.driver272);
        comment272= findViewById(R.id.comment272);
        s272= findViewById(R.id.s272);
        sm272= findViewById(R.id.sm272);
        name273=findViewById(R.id.name273);
        point273=findViewById(R.id.point273);
        Section273=findViewById(R.id.Section273);
        target273=findViewById(R.id.target273);
        team273=findViewById(R.id.team273);
        location273=findViewById(R.id.location273);
        tmael273= findViewById(R.id.tmael273);
        date273= findViewById(R.id.date273);
        driver273= findViewById(R.id.driver273);
        comment273= findViewById(R.id.comment273);
        s273= findViewById(R.id.s273);
        sm273= findViewById(R.id.sm273);
        name274=findViewById(R.id.name274);
        point274=findViewById(R.id.point274);
        Section274=findViewById(R.id.Section274);
        target274=findViewById(R.id.target274);
        team274=findViewById(R.id.team274);
        location274=findViewById(R.id.location274);
        tmael274= findViewById(R.id.tmael274);
        date274= findViewById(R.id.date274);
        driver274= findViewById(R.id.driver274);
        comment274= findViewById(R.id.comment274);
        s274= findViewById(R.id.s274);
        sm274= findViewById(R.id.sm274);
        name275=findViewById(R.id.name275);
        point275=findViewById(R.id.point275);
        Section275=findViewById(R.id.Section275);
        target275=findViewById(R.id.target275);
        team275=findViewById(R.id.team275);
        location275=findViewById(R.id.location275);
        tmael275= findViewById(R.id.tmael275);
        date275= findViewById(R.id.date275);
        driver275= findViewById(R.id.driver275);
        comment275= findViewById(R.id.comment275);
        s275= findViewById(R.id.s275);
        sm275= findViewById(R.id.sm275);
        name276=findViewById(R.id.name276);
        point276=findViewById(R.id.point276);
        Section276=findViewById(R.id.Section276);
        target276=findViewById(R.id.target276);
        team276=findViewById(R.id.team276);
        location276=findViewById(R.id.location276);
        tmael276= findViewById(R.id.tmael276);
        date276= findViewById(R.id.date276);
        driver276= findViewById(R.id.driver276);
        comment276= findViewById(R.id.comment276);
        s276= findViewById(R.id.s276);
        sm276= findViewById(R.id.sm276);
        name277=findViewById(R.id.name277);
        point277=findViewById(R.id.point277);
        Section277=findViewById(R.id.Section277);
        target277=findViewById(R.id.target277);
        team277=findViewById(R.id.team277);
        location277=findViewById(R.id.location277);
        tmael277= findViewById(R.id.tmael277);
        date277= findViewById(R.id.date277);
        driver277= findViewById(R.id.driver277);
        comment277= findViewById(R.id.comment277);
        s277= findViewById(R.id.s277);
        sm277= findViewById(R.id.sm277);
        name278=findViewById(R.id.name278);
        point278=findViewById(R.id.point278);
        Section278=findViewById(R.id.Section278);
        target278=findViewById(R.id.target278);
        team278=findViewById(R.id.team278);
        location278=findViewById(R.id.location278);
        tmael278= findViewById(R.id.tmael278);
        date278= findViewById(R.id.date278);
        driver278= findViewById(R.id.driver278);
        comment278= findViewById(R.id.comment278);
        s278= findViewById(R.id.s278);
        sm278= findViewById(R.id.sm278);
        name279=findViewById(R.id.name279);
        point279=findViewById(R.id.point279);
        Section279=findViewById(R.id.Section279);
        target279=findViewById(R.id.target279);
        team279=findViewById(R.id.team279);
        location279=findViewById(R.id.location279);
        tmael279= findViewById(R.id.tmael279);
        date279= findViewById(R.id.date279);
        driver279= findViewById(R.id.driver279);
        comment279= findViewById(R.id.comment279);
        s279= findViewById(R.id.s279);
        sm279= findViewById(R.id.sm279);
        name280=findViewById(R.id.name280);
        point280=findViewById(R.id.point280);
        Section280=findViewById(R.id.Section280);
        target280=findViewById(R.id.target280);
        team280=findViewById(R.id.team280);
        location280=findViewById(R.id.location280);
        tmael280= findViewById(R.id.tmael280);
        date280= findViewById(R.id.date280);
        driver280= findViewById(R.id.driver280);
        comment280= findViewById(R.id.comment280);
        s280= findViewById(R.id.s280);
        sm280= findViewById(R.id.sm280);
        name281=findViewById(R.id.name281);
        point281=findViewById(R.id.point281);
        Section281=findViewById(R.id.Section281);
        target281=findViewById(R.id.target281);
        team281=findViewById(R.id.team281);
        location281=findViewById(R.id.location281);
        tmael281= findViewById(R.id.tmael281);
        date281= findViewById(R.id.date281);
        driver281= findViewById(R.id.driver281);
        comment281= findViewById(R.id.comment281);
        s281= findViewById(R.id.s281);
        sm281= findViewById(R.id.sm281);
        name282=findViewById(R.id.name282);
        point282=findViewById(R.id.point282);
        Section282=findViewById(R.id.Section282);
        target282=findViewById(R.id.target282);
        team282=findViewById(R.id.team282);
        location282=findViewById(R.id.location282);
        tmael282= findViewById(R.id.tmael282);
        date282= findViewById(R.id.date282);
        driver282= findViewById(R.id.driver282);
        comment282= findViewById(R.id.comment282);
        s282= findViewById(R.id.s282);
        sm282= findViewById(R.id.sm282);
        name283=findViewById(R.id.name283);
        point283=findViewById(R.id.point283);
        Section283=findViewById(R.id.Section283);
        target283=findViewById(R.id.target283);
        team283=findViewById(R.id.team283);
        location283=findViewById(R.id.location283);
        tmael283= findViewById(R.id.tmael283);
        date283= findViewById(R.id.date283);
        driver283= findViewById(R.id.driver283);
        comment283= findViewById(R.id.comment283);
        s283= findViewById(R.id.s283);
        sm283= findViewById(R.id.sm283);
        name284=findViewById(R.id.name284);
        point284=findViewById(R.id.point284);
        Section284=findViewById(R.id.Section284);
        target284=findViewById(R.id.target284);
        team284=findViewById(R.id.team284);
        location284=findViewById(R.id.location284);
        tmael284= findViewById(R.id.tmael284);
        date284= findViewById(R.id.date284);
        driver284= findViewById(R.id.driver284);
        comment284= findViewById(R.id.comment284);
        s284= findViewById(R.id.s284);
        sm284= findViewById(R.id.sm284);
        name285=findViewById(R.id.name285);
        point285=findViewById(R.id.point285);
        Section285=findViewById(R.id.Section285);
        target285=findViewById(R.id.target285);
        team285=findViewById(R.id.team285);
        location285=findViewById(R.id.location285);
        tmael285= findViewById(R.id.tmael285);
        date285= findViewById(R.id.date285);
        driver285= findViewById(R.id.driver285);
        comment285= findViewById(R.id.comment285);
        s285= findViewById(R.id.s285);
        sm285= findViewById(R.id.sm285);
        name286=findViewById(R.id.name286);
        point286=findViewById(R.id.point286);
        Section286=findViewById(R.id.Section286);
        target286=findViewById(R.id.target286);
        team286=findViewById(R.id.team286);
        location286=findViewById(R.id.location286);
        tmael286= findViewById(R.id.tmael286);
        date286= findViewById(R.id.date286);
        driver286= findViewById(R.id.driver286);
        comment286= findViewById(R.id.comment286);
        s286= findViewById(R.id.s286);
        sm286= findViewById(R.id.sm286);
        name287=findViewById(R.id.name287);
        point287=findViewById(R.id.point287);
        Section287=findViewById(R.id.Section287);
        target287=findViewById(R.id.target287);
        team287=findViewById(R.id.team287);
        location287=findViewById(R.id.location287);
        tmael287= findViewById(R.id.tmael287);
        date287= findViewById(R.id.date287);
        driver287= findViewById(R.id.driver287);
        comment287= findViewById(R.id.comment287);
        s287= findViewById(R.id.s287);
        sm287= findViewById(R.id.sm287);
        name288=findViewById(R.id.name288);
        point288=findViewById(R.id.point288);
        Section288=findViewById(R.id.Section288);
        target288=findViewById(R.id.target288);
        team288=findViewById(R.id.team288);
        location288=findViewById(R.id.location288);
        tmael288= findViewById(R.id.tmael288);
        date288= findViewById(R.id.date288);
        driver288= findViewById(R.id.driver288);
        comment288= findViewById(R.id.comment288);
        s288= findViewById(R.id.s288);
        sm288= findViewById(R.id.sm288);
        name289=findViewById(R.id.name289);
        point289=findViewById(R.id.point289);
        Section289=findViewById(R.id.Section289);
        target289=findViewById(R.id.target289);
        team289=findViewById(R.id.team289);
        location289=findViewById(R.id.location289);
        tmael289= findViewById(R.id.tmael289);
        date289= findViewById(R.id.date289);
        driver289= findViewById(R.id.driver289);
        comment289= findViewById(R.id.comment289);
        s289= findViewById(R.id.s289);
        sm289= findViewById(R.id.sm289);
        name290=findViewById(R.id.name290);
        point290=findViewById(R.id.point290);
        Section290=findViewById(R.id.Section290);
        target290=findViewById(R.id.target290);
        team290=findViewById(R.id.team290);
        location290=findViewById(R.id.location290);
        tmael290= findViewById(R.id.tmael290);
        date290= findViewById(R.id.date290);
        driver290= findViewById(R.id.driver290);
        comment290= findViewById(R.id.comment290);
        s290= findViewById(R.id.s290);
        sm290= findViewById(R.id.sm290);
        name291=findViewById(R.id.name291);
        point291=findViewById(R.id.point291);
        Section291=findViewById(R.id.Section291);
        target291=findViewById(R.id.target291);
        team291=findViewById(R.id.team291);
        location291=findViewById(R.id.location291);
        tmael291= findViewById(R.id.tmael291);
        date291= findViewById(R.id.date291);
        driver291= findViewById(R.id.driver291);
        comment291= findViewById(R.id.comment291);
        s291= findViewById(R.id.s291);
        sm291= findViewById(R.id.sm291);
        name292=findViewById(R.id.name292);
        point292=findViewById(R.id.point292);
        Section292=findViewById(R.id.Section292);
        target292=findViewById(R.id.target292);
        team292=findViewById(R.id.team292);
        location292=findViewById(R.id.location292);
        tmael292= findViewById(R.id.tmael292);
        date292= findViewById(R.id.date292);
        driver292= findViewById(R.id.driver292);
        comment292= findViewById(R.id.comment292);
        s292= findViewById(R.id.s292);
        sm292= findViewById(R.id.sm292);
        name293=findViewById(R.id.name293);
        point293=findViewById(R.id.point293);
        Section293=findViewById(R.id.Section293);
        target293=findViewById(R.id.target293);
        team293=findViewById(R.id.team293);
        location293=findViewById(R.id.location293);
        tmael293= findViewById(R.id.tmael293);
        date293= findViewById(R.id.date293);
        driver293= findViewById(R.id.driver293);
        comment293= findViewById(R.id.comment293);
        s293= findViewById(R.id.s293);
        sm293= findViewById(R.id.sm293);
        name294=findViewById(R.id.name294);
        point294=findViewById(R.id.point294);
        Section294=findViewById(R.id.Section294);
        target294=findViewById(R.id.target294);
        team294=findViewById(R.id.team294);
        location294=findViewById(R.id.location294);
        tmael294= findViewById(R.id.tmael294);
        date294= findViewById(R.id.date294);
        driver294= findViewById(R.id.driver294);
        comment294= findViewById(R.id.comment294);
        s294= findViewById(R.id.s294);
        sm294= findViewById(R.id.sm294);
        name295=findViewById(R.id.name295);
        point295=findViewById(R.id.point295);
        Section295=findViewById(R.id.Section295);
        target295=findViewById(R.id.target295);
        team295=findViewById(R.id.team295);
        location295=findViewById(R.id.location295);
        tmael295= findViewById(R.id.tmael295);
        date295= findViewById(R.id.date295);
        driver295= findViewById(R.id.driver295);
        comment295= findViewById(R.id.comment295);
        s295= findViewById(R.id.s295);
        sm295= findViewById(R.id.sm295);
        name296=findViewById(R.id.name296);
        point296=findViewById(R.id.point296);
        Section296=findViewById(R.id.Section296);
        target296=findViewById(R.id.target296);
        team296=findViewById(R.id.team296);
        location296=findViewById(R.id.location296);
        tmael296= findViewById(R.id.tmael296);
        date296= findViewById(R.id.date296);
        driver296= findViewById(R.id.driver296);
        comment296= findViewById(R.id.comment296);
        s296= findViewById(R.id.s296);
        sm296= findViewById(R.id.sm296);
        name297=findViewById(R.id.name297);
        point297=findViewById(R.id.point297);
        Section297=findViewById(R.id.Section297);
        target297=findViewById(R.id.target297);
        team297=findViewById(R.id.team297);
        location297=findViewById(R.id.location297);
        tmael297= findViewById(R.id.tmael297);
        date297= findViewById(R.id.date297);
        driver297= findViewById(R.id.driver297);
        comment297= findViewById(R.id.comment297);
        s297= findViewById(R.id.s297);
        sm297= findViewById(R.id.sm297);
        name298=findViewById(R.id.name298);
        point298=findViewById(R.id.point298);
        Section298=findViewById(R.id.Section298);
        target298=findViewById(R.id.target298);
        team298=findViewById(R.id.team298);
        location298=findViewById(R.id.location298);
        tmael298= findViewById(R.id.tmael298);
        date298= findViewById(R.id.date298);
        driver298= findViewById(R.id.driver298);
        comment298= findViewById(R.id.comment298);
        s298= findViewById(R.id.s298);
        sm298= findViewById(R.id.sm298);
        name299=findViewById(R.id.name299);
        point299=findViewById(R.id.point299);
        Section299=findViewById(R.id.Section299);
        target299=findViewById(R.id.target299);
        team299=findViewById(R.id.team299);
        location299=findViewById(R.id.location299);
        tmael299= findViewById(R.id.tmael299);
        date299= findViewById(R.id.date299);
        driver299= findViewById(R.id.driver299);
        comment299= findViewById(R.id.comment299);
        s299= findViewById(R.id.s299);
        sm299= findViewById(R.id.sm299);
        name300=findViewById(R.id.name300);
        point300=findViewById(R.id.point300);
        Section300=findViewById(R.id.Section300);
        target300=findViewById(R.id.target300);
        team300=findViewById(R.id.team300);
        location300=findViewById(R.id.location300);
        tmael300= findViewById(R.id.tmael300);
        date300= findViewById(R.id.date300);
        driver300= findViewById(R.id.driver300);
        comment300= findViewById(R.id.comment300);
        s300= findViewById(R.id.s300);
        sm300= findViewById(R.id.sm300);



    }


    @Override
    public void onResume() {
        v = true;
        super.onResume();
        setIsAppRunning(v);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference num = database.getReference("numTask");
        num.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                numTask = dataSnapshot.getValue(Integer.class);
/*
               for(int i=0;i<numTask;i++)
               {

               }

                /*
                if (numTask > 2){
                    Tab1.setVisibility(View.VISIBLE);}
                if (numTask > 3) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                }
                if (numTask > 4) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                    Tab3.setVisibility(View.VISIBLE);
                }
                if (numTask > 5) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                    Tab3.setVisibility(View.VISIBLE);
                    Tab4.setVisibility(View.VISIBLE);
                }
                if (numTask > 6) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                    Tab3.setVisibility(View.VISIBLE);
                    Tab4.setVisibility(View.VISIBLE);
                    Tab5.setVisibility(View.VISIBLE);
                }
                    if (numTask > 7) {
                        Tab1.setVisibility(View.VISIBLE);
                        Tab2.setVisibility(View.VISIBLE);
                        Tab3.setVisibility(View.VISIBLE);
                        Tab4.setVisibility(View.VISIBLE);
                        Tab5.setVisibility(View.VISIBLE);
                        Tab6.setVisibility(View.VISIBLE);
                }

*/

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });







        DatabaseReference mDatabase = database.getReference("Tasks");
        sm1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("1").child("safety_and_security_approval").setValue("true");
                } else {
                    mDatabase.child("1").child("safety_and_security_approval").setValue("false");
                }
            }
        });
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("1").child("field_manager_approval").setValue("true");
                } else {
                    mDatabase.child("1").child("field_manager_approval").setValue("false");
                }
            }
        });
      mDatabase.child("1").child("safety_and_security_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                sm1.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("field_manager_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                s1.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        tmael1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("1").child("tmael").setValue(tmael1.getText().toString());



                return false;
            }
        });
        comment1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("1").child("comment").setValue(comment1.getText().toString());


                return false;
            }
        });
        driver1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("1").child("driver").setValue(driver1.getText().toString());


                return false;
            }
        });





        mDatabase.child("1").child("tmael").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tmael1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("driver").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                driver1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("1").child("comment").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                comment1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("date").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                date1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("1").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        sm2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("2").child("safety_and_security_approval").setValue("true");
                } else {
                    mDatabase.child("2").child("safety_and_security_approval").setValue("false");
                }
            }
        });
        s2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("2").child("field_manager_approval").setValue("true");
                } else {
                    mDatabase.child("2").child("field_manager_approval").setValue("false");
                }
            }
        });
        mDatabase.child("2").child("safety_and_security_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                sm2.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("field_manager_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                s2.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        tmael2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("2").child("tmael").setValue(tmael2.getText().toString());



                return false;
            }
        });
        comment2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("2").child("comment").setValue(comment2.getText().toString());


                return false;
            }
        });
        driver2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("2").child("driver").setValue(driver2.getText().toString());


                return false;
            }
        });





        mDatabase.child("2").child("tmael").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tmael2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("driver").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                driver2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("2").child("comment").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                comment2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("date").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                date2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        mDatabase.child("2").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("2").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        sm3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("3").child("safety_and_security_approval").setValue("true");
                } else {
                    mDatabase.child("3").child("safety_and_security_approval").setValue("false");
                }
            }
        });
        s3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("3").child("field_manager_approval").setValue("true");
                } else {
                    mDatabase.child("3").child("field_manager_approval").setValue("false");
                }
            }
        });
        mDatabase.child("3").child("safety_and_security_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                sm3.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("field_manager_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                s3.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        tmael3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("3").child("tmael").setValue(tmael3.getText().toString());



                return false;
            }
        });
        comment3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("3").child("comment").setValue(comment3.getText().toString());


                return false;
            }
        });
        driver3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("3").child("driver").setValue(driver3.getText().toString());


                return false;
            }
        });





        mDatabase.child("3").child("tmael").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tmael3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("driver").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                driver3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("3").child("comment").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                comment3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("3").child("date").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                date3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("3").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //  error.toException();
            }
        });
        mDatabase.child("3").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("3").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        sm4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("4").child("safety_and_security_approval").setValue("true");
                } else {
                    mDatabase.child("4").child("safety_and_security_approval").setValue("false");
                }
            }
        });
        s4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("4").child("field_manager_approval").setValue("true");
                } else {
                    mDatabase.child("4").child("field_manager_approval").setValue("false");
                }
            }
        });
        mDatabase.child("4").child("safety_and_security_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                sm4.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("field_manager_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                s4.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        tmael4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("4").child("tmael").setValue(tmael4.getText().toString());



                return false;
            }
        });
        comment4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("4").child("comment").setValue(comment4.getText().toString());


                return false;
            }
        });
        driver4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("4").child("driver").setValue(driver4.getText().toString());


                return false;
            }
        });





        mDatabase.child("4").child("tmael").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tmael4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("driver").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                driver4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("4").child("comment").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                comment4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("4").child("date").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                date4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        mDatabase.child("4").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        sm5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("5").child("safety_and_security_approval").setValue("true");
                } else {
                    mDatabase.child("5").child("safety_and_security_approval").setValue("false");
                }
            }
        });
        s5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mDatabase.child("5").child("field_manager_approval").setValue("true");
                } else {
                    mDatabase.child("5").child("field_manager_approval").setValue("false");
                }
            }
        });
        mDatabase.child("5").child("safety_and_security_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                sm5.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("field_manager_approval").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                s5.setChecked(Boolean.parseBoolean(dataSnapshot.getValue(String.class)));


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        tmael5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("5").child("tmael").setValue(tmael5.getText().toString());



                return false;
            }
        });
        comment5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("5").child("comment").setValue(comment5.getText().toString());


                return false;
            }
        });
        driver5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                mDatabase.child("5").child("driver").setValue(driver5.getText().toString());


                return false;
            }
        });





        mDatabase.child("5").child("tmael").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                tmael5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("driver").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                driver5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("5").child("comment").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                comment5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("date").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                date5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });
        edit_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "تم التحديث بنجاح", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "لا يوجد اتصال بالأنترنت", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean isConnected() {
        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;




    }

}