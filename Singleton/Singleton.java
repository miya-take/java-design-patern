public class Singleton {
    /**
     * ================================
     * Singletonクラス
     * 複数のインスタンスが作られないクラス
     * アプリ全体で共通の設定を行うような場合に利用する
     * 1.自身の型のインスタンスがprivateなクラス変数として定義されている
     * 2.外部から生成されないように、コンストラクタをprivateに
     * 3.インスタンスを返すためのクラス関数が定義されている
     * ================================
     */

//    // 1
//    private static Singleton singleton = new Singleton();

    // 2
    /**
     * 外部からインスタンス化できないように、コンストラクタをPrivateで宣言
     */
    private Singleton(){
        // 実際にはファイルデータベースなどから設定情報を読み込む処理を書く
    }

    // 3
    /**
     * 唯一のインスタンを返す
     * @return このクラス唯一のインスタンス
     */
    public static Singleton getInstance(){
        return SingletonInstanceHolder.INSTANCE;
    }

    /**
     * 指定されたキーに対応する設定値を返す
     * @param key 設定キー
     * @return 設定値
     */
    public String getValue(String key){
        return null;
    }

    // 1 この書き方をすることで、Singletonクラスがロードされた時点では、Singletonインスタンスは生成されない
    // Singleton#getInstance() を最初に呼び出したときに、SingletonHolderがロードされて、Singletonインスタンスが生成される
    // ギリギリまで、Singletonインスタンスを生成しないような挙動になる
    /**
     * Singletonクラス唯一のインスタンスを保持する内部クラス
     */
    public static class SingletonInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }




}
