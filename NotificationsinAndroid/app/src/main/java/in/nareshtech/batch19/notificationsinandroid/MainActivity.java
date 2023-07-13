package in.nareshtech.batch19.notificationsinandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // You need to create a notification channel when you want to run your app on the devices above or equal to 8.0
    private String NOTIFICATION_CHANNEL_ID = "MyNotif";
    private NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Notifications are system services
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // To create Notificationchannel
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel =
                    new NotificationChannel(NOTIFICATION_CHANNEL_ID,
                            "My Notifications",NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableVibration(true);
            manager.createNotificationChannel(channel);
        }
    }

    public void sendNotification(View view) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,NOTIFICATION_CHANNEL_ID);
        //to show an icon
        builder.setSmallIcon(R.drawable.baseline_umbrella_24);
        builder.setContentTitle("My Sample Notification");
        builder.setContentText("Hello, this is just a sample notification!");
        builder.setAutoCancel(true);
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        /*builder.setOngoing(true);*/

        manager.notify(43,builder.build());
    }

    public void cancelNotification(View view) {
        manager.cancel(43);
        /*manager.cancelAll();*/
    }
}