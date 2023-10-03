
package clock;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class Clock extends JFrame{

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    SimpleDateFormat startTimeFormat;
    SimpleDateFormat finishTimeFormat;
    
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    JLabel startTimeLabel;
    JLabel finishTimeLabel;
    String time;
    String day;
    String date;
    long start;
    long finish;
    long timeElapsed;
    
    Clock(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(450, 320);
        this.setResizable(true);
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 59));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setForeground(Color.RED);
        timeLabel.setOpaque(false);
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Tree", Font.BOLD, 34));
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Tree", Font.BOLD, 30));
        
        // Time elspse
        startTimeLabel = new JLabel();
        startTimeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 30));
        startTimeFormat = new SimpleDateFormat("hh:mm:ss a");
        
        finishTimeLabel = new JLabel();
        finishTimeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 30));
        finishTimeFormat = new SimpleDateFormat("hh:mm:ss a");
        
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.add(startTimeLabel);
        this.add(finishTimeLabel);
        this.setVisible(true);
        
        setTimer();
    }
    
    public void setTimer(){
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            
            long start = System.nanoTime();
            String StartT = String.valueOf(start);
            startTimeLabel.setText("Start time: " +StartT);
                    
            long finish = System.nanoTime();
            String end = String.valueOf("Finish time: " + finish);
            finishTimeLabel.setText(end);
            
            try{
                Thread.sleep(1000);
                }catch(Exception e){
                    e.getStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new Clock();
    }
    
}
