package com.example.hywoman.myapplication;

/**
 * Created by hywoman on 2017-06-13.
 */

public class SubActivity1 {
    String id;
    String password;
    String correctid = "bh3kks";
    String correctpassword = "1234";
}
protected void onCreate(Bundle savedInstancestate)
{
    super.onCreate(savedInstancestate);
    setContentView(R.layout.activity_sub1);

    Button loginbtn = (Button) findViewById((R.id.Loginbtn);
    loginbtn.setOnClickListener(new View.OnClickListener(){
        @Override
        public vid onClick(View v)
        {
            EditText idEditText = (EditText) findViewById(R.id.idEditText);
            EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
            id = idEditText.getText().toString();
            password = passwordEditText.getText().toString();

            if(id.equals(correctid) && password.equals(correctpassword)){
                Toast.makeText(getApplicationContext(), "로그인 되었습니다.",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "다시 입력해주세요.",
                    Toast.LENGTH_SHORT).show();
            }
        }
    });

}