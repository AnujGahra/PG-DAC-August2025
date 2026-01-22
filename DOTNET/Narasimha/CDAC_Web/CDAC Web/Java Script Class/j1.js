function selAll()
{
     var chk=document.f1.selall.checked;
     alert(chk);
 alert(    document.f1.pid.length);
for(i=0;i<document.f1.pid.length;i++)
    {
           document.f1.pid[i].checked=chk;
    }
}
