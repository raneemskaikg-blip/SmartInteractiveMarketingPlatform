package com.mycompany.smartinteractivemarketingplatform;

public class SmartInteractiveMarketingPlatform {
    
    // (Private) تطبيق مبدأ إخفاء المعلومات باستخدام متغيرات خاصة
    private int qrID;
    private String linkURL;

    // (المنشئ) لبناء الكائن Constructor
    public SmartInteractiveMarketingPlatform(int id, String url) {
        this.qrID = id;
        this.linkURL = url;
    }

    // (محاكاة للوظيفة البرمجية) دالة لتوليد الكود وعرضه
    public void generateQR() {
        System.out.println("--- Smart QR System ---");
        System.out.println("Generating QR for URL: " + this.linkURL);
        System.out.println("Status: QR Code [" + this.qrID + "] is successfully active.");
    }

    public static void main(String[] args) {
        // تجربة تشغيل الكود (Testing)
        SmartInteractiveMarketingPlatform myCode = new SmartInteractiveMarketingPlatform(101, "https://ar-marketing-view.com");
        myCode.generateQR();
        
        System.out.println("\nBUILD SUCCESSFUL - System is running correctly!");
    }
}