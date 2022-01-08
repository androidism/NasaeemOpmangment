package org.ismail.nasaeemopmangment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;

public class Add_Task extends AppCompatActivity {

    FloatingActionButton fl_back;
    EditText target, team, location,date;
    Spinner depart,name,point;
    Button add_tasks;
    Integer numTask;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mDatabase = database.getReference();
    DatePickerDialog picker;




    public void addChild(){
    mDatabase.child("Tasks").child(numTask.toString()).child("target").setValue(target.getText().toString());
    mDatabase.child("Tasks").child(numTask.toString()).child("name").setValue(name.getSelectedItem().toString());
    mDatabase.child("Tasks").child(numTask.toString()).child("location").setValue(location.getText().toString());
    mDatabase.child("Tasks").child(numTask.toString()).child("depart").setValue(depart.getSelectedItem().toString());
    mDatabase.child("Tasks").child(numTask.toString()).child("point").setValue(point.getSelectedItem().toString());
    mDatabase.child("Tasks").child(numTask.toString()).child("team").setValue(team.getText().toString());
    mDatabase.child("Tasks").child(numTask.toString()).child("date").setValue(date.getText().toString());
    target.setText("");
    location.setText("");
    team.setText("");
    date.setText("");
    numTask++;
    mDatabase.child("numTask").setValue(numTask);

}


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        date=findViewById(R.id.date);

     date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(Add_Task.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });


        getSupportActionBar().hide();

        fl_back = findViewById(R.id.fl_back);

        fl_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                finishAffinity();
                System.exit(0);
           //     Intent intent = new Intent(Add_Task.this, MainActivity2.class);
             //   startActivity(intent);

                //Toast.makeText(Add_Task.this, "شكراً لأنك ماضفت مهمة", Toast.LENGTH_SHORT).show();
            }
        });

        add_tasks = findViewById(R.id.add_task);
        name = findViewById(R.id.name);
        target = findViewById(R.id.target);
        team = findViewById(R.id.team);
        location = findViewById(R.id.location);
        depart = findViewById(R.id.depart);
        point= findViewById(R.id.point);








        mDatabase.child("numTask").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                numTask = dataSnapshot.getValue(Integer.class);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });


        add_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (location.getText().toString().equals("")||target.getText().toString().equals("")||team.getText().toString().equals("")||date.getText().toString().equals("")) {
                    Toast.makeText(Add_Task.this, "يرجى عدم ترك بيانات فارغة", Toast.LENGTH_SHORT).show();
                }
                else{
                    DatabaseReference mDatabase = database.getReference();
                    switch (numTask) {
                        case 1:
                            addChild();
                            break;
                        case 2:
                            addChild();
                            break;
                        case 3:
                            addChild();
                            break;
                        case 4:
                            addChild();
                            break;
                        case 5:
                            addChild();
                            break;
                        case 6:
                            addChild();
                            break;
                        case 7:
                            addChild();
                            break;
                        case 8:
                            addChild();
                            break;
                        case 9:
                            addChild();
                            break;
                        case 10:
                            addChild();
                            break;
                        case 11:
                            addChild();
                            break;
                        case 12:
                            addChild();
                            break;
                        case 13:
                            addChild();
                            break;
                        case 14:
                            addChild();
                            break;
                        case 15:
                            addChild();
                            break;
                        case 16:
                            addChild();
                            break;
                        case 17:
                            addChild();
                            break;
                        case 18:
                            addChild();
                            break;
                        case 19:
                            addChild();
                            break;
                        case 20:
                            addChild();
                            break;
                        case 21:
                            addChild();
                            break;
                        case 22:
                            addChild();
                            break;
                        case 23:
                            addChild();
                            break;
                        case 24:
                            addChild();
                            break;
                        case 25:
                            addChild();
                            break;
                        case 26:
                            addChild();
                            break;
                        case 27:
                            addChild();
                            break;
                        case 28:
                            addChild();
                            break;
                        case 29:
                            addChild();
                            break;
                        case 30:
                            addChild();
                            break;
                        case 31:
                            addChild();
                            break;
                        case 32:
                            addChild();
                            break;
                        case 33:
                            addChild();
                            break;
                        case 34:
                            addChild();
                            break;
                        case 35:
                            addChild();
                            break;
                        case 36:
                            addChild();
                            break;
                        case 37:
                            addChild();
                            break;
                        case 38:
                            addChild();
                            break;
                        case 39:
                            addChild();
                            break;
                        case 40:
                            addChild();
                            break;
                        case 41:
                            addChild();
                            break;
                        case 42:
                            addChild();
                            break;
                        case 43:
                            addChild();
                            break;
                        case 44:
                            addChild();
                            break;
                        case 45:
                            addChild();
                            break;
                        case 46:
                            addChild();
                            break;
                        case 47:
                            addChild();
                            break;
                        case 48:
                            addChild();
                            break;
                        case 49:
                            addChild();
                            break;
                        case 50:
                            addChild();
                            break;
                        case 51:
                            addChild();
                            break;
                        case 52:
                            addChild();
                            break;
                        case 53:
                            addChild();
                            break;
                        case 54:
                            addChild();
                            break;
                        case 55:
                            addChild();
                            break;
                        case 56:
                            addChild();
                            break;
                        case 57:
                            addChild();
                            break;
                        case 58:
                            addChild();
                            break;
                        case 59:
                            addChild();
                            break;
                        case 60:
                            addChild();
                            break;
                        case 61:
                            addChild();
                            break;
                        case 62:
                            addChild();
                            break;
                        case 63:
                            addChild();
                            break;
                        case 64:
                            addChild();
                            break;
                        case 65:
                            addChild();
                            break;
                        case 66:
                            addChild();
                            break;
                        case 67:
                            addChild();
                            break;
                        case 68:
                            addChild();
                            break;
                        case 69:
                            addChild();
                            break;
                        case 70:
                            addChild();
                            break;
                        case 71:
                            addChild();
                            break;
                        case 72:
                            addChild();
                            break;
                        case 73:
                            addChild();
                            break;
                        case 74:
                            addChild();
                            break;
                        case 75:
                            addChild();
                            break;
                        case 76:
                            addChild();
                            break;
                        case 77:
                            addChild();
                            break;
                        case 78:
                            addChild();
                            break;
                        case 79:
                            addChild();
                            break;
                        case 80:
                            addChild();
                            break;
                        case 81:
                            addChild();
                            break;
                        case 82:
                            addChild();
                            break;
                        case 83:
                            addChild();
                            break;
                        case 84:
                            addChild();
                            break;
                        case 85:
                            addChild();
                            break;
                        case 86:
                            addChild();
                            break;
                        case 87:
                            addChild();
                            break;
                        case 88:
                            addChild();
                            break;
                        case 89:
                            addChild();
                            break;
                        case 90:
                            addChild();
                            break;
                        case 91:
                            addChild();
                            break;
                        case 92:
                            addChild();
                            break;
                        case 93:
                            addChild();
                            break;
                        case 94:
                            addChild();
                            break;
                        case 95:
                            addChild();
                            break;
                        case 96:
                            addChild();
                            break;
                        case 97:
                            addChild();
                            break;
                        case 98:
                            addChild();
                            break;
                        case 99:
                            addChild();
                            break;
                        case 100:
                            addChild();
                            break;
                        case 101:
                            addChild();
                            break;
                        case 102:
                            addChild();
                            break;
                        case 103:
                            addChild();
                            break;
                        case 104:
                            addChild();
                            break;
                        case 105:
                            addChild();
                            break;
                        case 106:
                            addChild();
                            break;
                        case 107:
                            addChild();
                            break;
                        case 108:
                            addChild();
                            break;
                        case 109:
                            addChild();
                            break;
                        case 110:
                            addChild();
                            break;
                        case 111:
                            addChild();
                            break;
                        case 112:
                            addChild();
                            break;
                        case 113:
                            addChild();
                            break;
                        case 114:
                            addChild();
                            break;
                        case 115:
                            addChild();
                            break;
                        case 116:
                            addChild();
                            break;
                        case 117:
                            addChild();
                            break;
                        case 118:
                            addChild();
                            break;
                        case 119:
                            addChild();
                            break;
                        case 120:
                            addChild();
                            break;
                        case 121:
                            addChild();
                            break;
                        case 122:
                            addChild();
                            break;
                        case 123:
                            addChild();
                            break;
                        case 124:
                            addChild();
                            break;
                        case 125:
                            addChild();
                            break;
                        case 126:
                            addChild();
                            break;
                        case 127:
                            addChild();
                            break;
                        case 128:
                            addChild();
                            break;
                        case 129:
                            addChild();
                            break;
                        case 130:
                            addChild();
                            break;
                        case 131:
                            addChild();
                            break;
                        case 132:
                            addChild();
                            break;
                        case 133:
                            addChild();
                            break;
                        case 134:
                            addChild();
                            break;
                        case 135:
                            addChild();
                            break;
                        case 136:
                            addChild();
                            break;
                        case 137:
                            addChild();
                            break;
                        case 138:
                            addChild();
                            break;
                        case 139:
                            addChild();
                            break;
                        case 140:
                            addChild();
                            break;
                        case 141:
                            addChild();
                            break;
                        case 142:
                            addChild();
                            break;
                        case 143:
                            addChild();
                            break;
                        case 144:
                            addChild();
                            break;
                        case 145:
                            addChild();
                            break;
                        case 146:
                            addChild();
                            break;
                        case 147:
                            addChild();
                            break;
                        case 148:
                            addChild();
                            break;
                        case 149:
                            addChild();
                            break;
                        case 150:
                            addChild();
                            break;
                        case 151:
                            addChild();
                            break;
                        case 152:
                            addChild();
                            break;
                        case 153:
                            addChild();
                            break;
                        case 154:
                            addChild();
                            break;
                        case 155:
                            addChild();
                            break;
                        case 156:
                            addChild();
                            break;
                        case 157:
                            addChild();
                            break;
                        case 158:
                            addChild();
                            break;
                        case 159:
                            addChild();
                            break;
                        case 160:
                            addChild();
                            break;
                        case 161:
                            addChild();
                            break;
                        case 162:
                            addChild();
                            break;
                        case 163:
                            addChild();
                            break;
                        case 164:
                            addChild();
                            break;
                        case 165:
                            addChild();
                            break;
                        case 166:
                            addChild();
                            break;
                        case 167:
                            addChild();
                            break;
                        case 168:
                            addChild();
                            break;
                        case 169:
                            addChild();
                            break;
                        case 170:
                            addChild();

                            break;
                        case 171:
                            addChild();
                            break;
                        case 172:
                            addChild();
                            break;
                        case 173:
                            addChild();
                            break;
                        case 174:
                            addChild();
                            break;
                        case 175:
                            addChild();
                            break;
                        case 176:
                            addChild();
                            break;
                        case 177:
                            addChild();
                            break;
                        case 178:
                            addChild();
                            break;
                        case 179:
                            addChild();
                            break;
                        case 180:
                            addChild();
                            break;
                        case 181:
                            addChild();
                            break;
                        case 182:
                            addChild();
                            break;
                        case 183:
                            addChild();
                            break;
                        case 184:
                            addChild();
                            break;
                        case 185:
                            addChild();
                            break;
                        case 186:
                            addChild();
                            break;
                        case 187:
                            addChild();
                            break;
                        case 188:
                            addChild();
                            break;
                        case 189:
                            addChild();
                            break;
                        case 190:
                            addChild();
                            break;
                        case 191:
                            addChild();
                            break;
                        case 192:
                            addChild();
                            break;
                        case 193:
                            addChild();
                            break;
                        case 194:
                            addChild();
                            break;
                        case 195:
                            addChild();
                            break;
                        case 196:
                            addChild();
                            break;
                        case 197:
                            addChild();
                            break;
                        case 198:
                            addChild();
                            break;
                        case 199:
                            addChild();
                            break;
                        case 200:
                            addChild();
                            break;
                        case 201:
                            addChild();
                            break;
                        case 202:
                            addChild();
                            break;
                        case 203:
                            addChild();
                            break;
                        case 204:
                            addChild();
                            break;
                        case 205:
                            addChild();
                            break;
                        case 206:
                            addChild();
                            break;
                        case 207:
                            addChild();
                            break;
                        case 208:
                            addChild();
                            break;
                        case 209:
                            addChild();
                            break;
                        case 210:
                            addChild();
                            break;
                        case 211:
                            addChild();
                            break;
                        case 212:
                            addChild();
                            break;
                        case 213:
                            addChild();
                            break;
                        case 214:
                            addChild();
                            break;
                        case 215:
                            addChild();
                            break;
                        case 216:
                            addChild();
                            break;
                        case 217:
                            addChild();
                            break;
                        case 218:
                            addChild();
                            break;
                        case 219:
                            addChild();
                            break;
                        case 220:
                            addChild();
                            break;
                        case 221:
                            addChild();
                            break;
                        case 222:
                            addChild();
                            break;
                        case 223:
                            addChild();
                            break;
                        case 224:
                            addChild();
                            break;
                        case 225:
                            addChild();
                            break;
                        case 226:
                            addChild();
                            break;
                        case 227:
                            addChild();
                            break;
                        case 228:
                            addChild();
                            break;
                        case 229:
                            addChild();
                            break;
                        case 230:
                            addChild();
                            break;
                        case 231:
                            addChild();
                            break;
                        case 232:
                            addChild();
                            break;
                        case 233:
                            addChild();
                            break;
                        case 234:
                            addChild();
                            break;
                        case 235:
                            addChild();
                            break;
                        case 236:
                            addChild();
                            break;
                        case 237:
                            addChild();
                            break;
                        case 238:
                            addChild();
                            break;
                        case 239:
                            addChild();
                            break;
                        case 240:
                            addChild();
                            break;
                        case 241:
                            addChild();
                            break;
                        case 242:
                            addChild();
                            break;
                        case 243:
                            addChild();
                            break;
                        case 244:
                            addChild();
                            break;
                        case 245:
                            addChild();
                            break;
                        case 246:
                            addChild();
                            break;
                        case 247:
                            addChild();
                            break;
                        case 248:
                            addChild();
                            break;
                        case 249:
                            addChild();
                            break;
                        case 250:
                            addChild();
                            break;
                        case 251:
                            addChild();
                            break;
                        case 252:
                            addChild();
                            break;
                        case 253:
                            addChild();
                            break;
                        case 254:
                            addChild();
                            break;
                        case 255:
                            addChild();
                            break;
                        case 256:
                            addChild();
                            break;
                        case 257:
                            addChild();
                            break;
                        case 258:
                            addChild();
                            break;
                        case 259:
                            addChild();
                            break;
                        case 260:
                            addChild();
                            break;
                        case 261:
                            addChild();
                            break;
                        case 262:
                            addChild();
                            break;
                        case 263:
                            addChild();
                            break;
                        case 264:
                            addChild();
                            break;
                        case 265:
                            addChild();
                            break;
                        case 266:
                            addChild();
                            break;
                        case 267:
                            addChild();
                            break;
                        case 268:
                            addChild();
                            break;
                        case 269:
                            addChild();
                            break;
                        case 270:
                            addChild();
                            break;
                        case 271:
                            addChild();
                            break;
                        case 272:
                            addChild();
                            break;
                        case 273:
                            addChild();
                            break;
                        case 274:
                            addChild();
                            break;
                        case 275:
                            addChild();
                            break;
                        case 276:
                            addChild();
                            break;
                        case 277:
                            addChild();
                            break;
                        case 278:
                            addChild();
                            break;
                        case 279:
                            addChild();
                            break;
                        case 280:
                            addChild();
                            break;
                        case 281:
                            addChild();
                            break;
                        case 282:
                            addChild();
                            break;
                        case 283:
                            addChild();
                            break;
                        case 284:
                            addChild();
                            break;
                        case 285:
                            addChild();
                            break;
                        case 286:
                            addChild();
                            break;
                        case 287:
                            addChild();
                            break;
                        case 288:
                            addChild();
                            break;
                        case 289:
                            addChild();
                            break;
                        case 290:
                            addChild();
                            break;
                        case 291:
                            addChild();
                            break;
                        case 292:
                            addChild();
                            break;
                        case 293:
                            addChild();
                            break;
                        case 294:
                            addChild();
                            break;
                        case 295:
                            addChild();
                            break;
                        case 296:
                            addChild();
                            break;
                        case 297:
                            addChild();
                            break;
                        case 298:
                            addChild();
                            break;
                        case 299:
                            addChild();
                            break;
                        case 300:
                            addChild();
                            break;
                    }
                 Toast.makeText(Add_Task.this, "تم رفع المهمة بالتوفيق", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
   }

