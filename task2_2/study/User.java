package study;
/**
* User.java
*/
public class User {

   // フィールド変数
   private String userName;
   private int id;
   private String password;

   // コンストラクタ
   public User(String userName, int id, String password) {
       this.userName = userName;
       this.id = id;
       this.password = password;
   }


   // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
   // アクセス修飾子:「protected」
   // メソッド名:「printAccountInfo」

   // public void printAccountInfo(){
   //   System.out.println("ユーザー名は、" + this.userName + "です");
   //   System.out.println("idは、" + this.id);
   //   System.out.println("パスワードは" + this.password);
   // }

   public String accountInfoString(){
     String text = "ユーザー名は、" + this.userName + "です" + "\n";
     text += "idは、" + this.id + "\n";
     text += "パスワードは" + this.password;
     return text;
   }
}
