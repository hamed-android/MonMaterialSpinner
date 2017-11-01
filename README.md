Forked from (ganfra/MaterialSpinner)



<hr />


spinner = findViewById(R.id.spinner);


<div class="highlight highlight-text-xml">
    <pre>
    
    
        ////////////////////////
        //Samples :
        ////////////////////////
        MonItem monItem1=new MonItem(1,"حامد عباسی");
        MonItem monItem2=new MonItem(2,"رضا محمدی");
        MonItem monItem3=new MonItem(3,"علی کریمی");
        
        ArrayList<MonItem> list= new ArrayList<>();
        list.add(monItem1);
        list.add(monItem2);
        list.add(monItem3);
        
        //Set :
        spinner.setItems(list);
        
        
        //events :
        spinner.setEvents(new Events() {
            @Override
            public void OnItemSelected(MonItem item) {
                Toast.makeText(MainActivity.this, "Selected ID : " + item.getId(),Toast.LENGTH_SHORT).show();
            }
        });
    
    
    
    </pre>

        
</div>