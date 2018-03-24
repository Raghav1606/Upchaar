package in.project.com.upchaar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.sql.Time;

public class DoctorsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private String doctorName, hospitalName, time, qualifications;

    public DoctorsListActivity(){}

    public DoctorsListActivity(String doctorName, String hospitalName, String time, String qualifications) {
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.time = time;
        this.qualifications = qualifications;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String name) {
        this.doctorName = name;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String name) {
        this.hospitalName = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String name) {
        this.time = name;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String name) {
        this.qualifications = name;
    }
}

