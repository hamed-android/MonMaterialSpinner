Forked from (ganfra/MaterialSpinner)



<hr />




<div class="highlight highlight-text-xml">
    <pre>
   
        
       <fr.ganfra.materialspinner.MonMaterialSpinner
               android:id="@+id/spinner"
               android:layout_width="match_parent"
               android:layout_height="wrap_content"
               android:layout_margin="12dp"
               app:ms_alignLabels="false"
               app:ms_arrowSize="16dp"
               app:ms_enableErrorLabel="false"
               app:ms_enableFloatingLabel="false"
               app:ms_floatingLabelText="floating label"
               app:ms_multiline="false"
               app:ms_thickness="2dp" />
    

        
</div>



<div class="highlight highlight-text-xml">
    <pre>
   
        spinner = findViewById(R.id.spinner);
        
        
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
    
    

        
</div>