package modelprj.test1;

public class FilteredByName implements FilterEmployees {

	@Override
	public boolean Filtered(Employee empl,String filterby) {
		if(empl.equals(filterby))
 		  return true;
		else
			return false;
	}

}
