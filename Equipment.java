// Calculate ROI
// Matthew McPhail
// CPT307: Data Structures and Algorithms
// Instructor: Dr. Tina Tian
// August 25, 2025

public class Equipment 
{
		// Public fields for each object
		public String name;
		public double cost;
		public double gain;
		
		//
		public Equipment(String name, double gain, double cost) 
		{
			this.name = name;
			this.gain = gain;
			this.cost = cost;
		}
		
		// Method to calculate ROI
		public double getRoi() 
		{
			return (gain - cost) / cost;
		}
}