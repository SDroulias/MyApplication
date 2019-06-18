package com.example.myapplication;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    private final String DEVICE_ADDRESS = "20:15:05:13:59:37"; //HC-06 MAC Address
    private final UUID PORT = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    String command;
    private BluetoothDevice btDevice;
    private BluetoothSocket btSocket;
    Button fwd_btn, fr_btn, fl_btn, bwd_btn, br_btn, bl_btn, left_btn, right_btn, connect_btn;
    private OutputStream oStream;
//    private InputStream iStream;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fwd_btn = findViewById(R.id.fwd_btn);
        fr_btn = findViewById(R.id.fr_btn);
        fl_btn = findViewById(R.id.fl_btn);

        bwd_btn = findViewById(R.id.bwd_btn);
        br_btn = findViewById(R.id.br_btn);
        bl_btn = findViewById(R.id.bl_btn);

        left_btn = findViewById(R.id.left_btn);
        right_btn = findViewById(R.id.right_btn);
        connect_btn = findViewById(R.id.connect_btn);

        fwd_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "1";
                    try {
                        oStream.write(command.getBytes());
                        System.out.println(oStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        fr_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "2";
                    try {
                        oStream.write(command.getBytes());
                        System.out.println(oStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        fl_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "3";
                    try {
                        oStream.write(command.getBytes());
                        System.out.println(oStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        bwd_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "4";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        br_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "5";
                    try {
                        oStream.write(command.getBytes());
                        System.out.println(oStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        bl_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "6";
                    try {
                        oStream.write(command.getBytes());
                        System.out.println(oStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        left_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "8";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        right_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    command = "7";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    command = "0";
                    try {
                        oStream.write(command.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

        connect_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BTinitialize()) {
                    BTConnect();
                }
            }
        });
    }

    public boolean BTinitialize() {
        boolean paired = false;
        Toast toast = null;
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            toast.makeText(getApplicationContext(), "Device Does Not Support BT", Toast.LENGTH_LONG).show();
        }
        if (!bluetoothAdapter.isEnabled()) {
            Intent enableBt = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBt, 0);
        }
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        if (pairedDevices.isEmpty()) {
            toast.makeText(getApplicationContext(), "Pair to device 1st", Toast.LENGTH_LONG).show();
        } else {
            for (BluetoothDevice pair : pairedDevices) {
                if (pair.getAddress().equals(DEVICE_ADDRESS)) {
                    btDevice = pair;
                    paired = true;
                    break;
                }
            }
        }
        return paired;
    }

    public boolean BTConnect() {
        boolean connection = true;
        try {
            btSocket = (BluetoothSocket) btDevice.createRfcommSocketToServiceRecord(PORT);
            btSocket.connect();
            Toast.makeText(getApplicationContext(), "Connection Successful", Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
            connection = false;
        }

        if (connection) {
            try {
                oStream = btSocket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            try {
//                iStream = btSocket.getInputStream();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
        return connection;
    }
}
