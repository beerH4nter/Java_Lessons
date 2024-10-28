package models;

import java.util.ArrayList;
import java.util.List;

public class Site {

    static class Page{
        static private int num = 0;
        static private int contentNum = 1;

        {
            num++;
        }
        private List<String> content = new ArrayList<>();
        public int getNum() {
            return num;
        }
        public void addContent(String cont){
            content.add(cont);
        }
    }

    private List<Page> pageList = new ArrayList<>();

    public void addPage(){
        Page page = new Page();
        int i = Page.contentNum;
        for (; i <= 10 * page.getNum(); i++) {
            page.addContent("Content #" + Page.contentNum);
            Page.contentNum++;
        }
        pageList.add(page);
    }

    public void showPage(int index){

        for (int i = 0; i < 10; i++) {
            System.out.println(pageList.get(index-1).content.get(i));
        }
    }

}
