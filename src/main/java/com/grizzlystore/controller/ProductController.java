package com.grizzlystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grizzlystore.bean.Category;
import com.grizzlystore.bean.Product;
import com.grizzlystore.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value="Admin-AddProduct.html", method=RequestMethod.GET)
	
	public String geProductPage()
	{
		return "Admin-AddProduct";
	}
	
	//deleteProductController working fine
	@RequestMapping(value="deleteProductController", method=RequestMethod.GET)
	public ModelAndView getDeleteProductPage(@RequestParam("id") String id)
	{
		ModelAndView modelAndView = new ModelAndView();
		productService.deleteProduct(id);
		modelAndView.addObject("products", productService.getAllProducts());
		modelAndView.setViewName("Admin-ListProducts");
		return modelAndView;
	}
	
	//addProduct working fine
	@RequestMapping(value="Admin-AddProduct.html", method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product) 
	{
		ModelAndView modelAndView = new ModelAndView();
		
		if(productService.addProduct(product).equals("success"))
		{
			modelAndView.addObject("products", productService.getAllProducts());
			modelAndView.setViewName("Admin-ListProducts");
			//System.out.println("Product Added");
		}
		else
		{
			modelAndView.setViewName("Admin-AddProduct");
			//System.out.println("Product Not Added");
		}
		return modelAndView;
	}
	
	
	//viewProductController working fine
		@RequestMapping(value="viewProductController", method=RequestMethod.GET)
		public ModelAndView getViewProductPage(@RequestParam("id") String id)
		{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("product", productService.findProduct(id));
			modelAndView.setViewName("Admin-ViewProduct");
			return modelAndView;
		}
		
		
		//sortProductController working fine
				@RequestMapping(value="SortByRatingController", method=RequestMethod.GET)
				public ModelAndView sortProductPage(@RequestParam("order") String order)
				{
					ModelAndView modelAndView = new ModelAndView();
					String query1=null;
					if(order.equals("LowToHigh"))
					{
					query1 = "from Product order by rating";
					modelAndView.addObject("products", productService.filterProducts(query1));
					modelAndView.setViewName("Admin-ListProducts");
					}
					else
					{
					query1 = "from Product order by rating desc";
					modelAndView.addObject("products", productService.filterProducts(query1));
					modelAndView.setViewName("Admin-ListProducts");
					}
					
					//modelAndView.addObject("products", productService.filterProducts(query1));
					
					return modelAndView;
				}
				
				
				@RequestMapping(value="ShowProductByCategoryController", method=RequestMethod.POST)
				public ModelAndView getProductsByCategory(@ModelAttribute Category category)
		
				{
					String categoryType = category.getName();
					String query1 = "from Product where category= '"+categoryType+"'"; 
				
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("products", productService.filterProducts(query1));
				
					modelAndView.setViewName("Admin-ListProducts");
					
					return modelAndView;
				}
				
				
				//sortProductController working fine
				@RequestMapping(value="VendorSortByRatingController", method=RequestMethod.GET)
				public ModelAndView sortProductPageVendor(@RequestParam("order") String order)
				{
					ModelAndView modelAndView = new ModelAndView();
					String query1=null;
					if(order.equals("LowToHigh"))
					{
					query1 = "from Product order by rating";
					modelAndView.addObject("products", productService.filterProducts(query1));
					modelAndView.setViewName("Vendor-AddProduct");
					}
					else
					{
					query1 = "from Product order by rating desc";
					modelAndView.addObject("products", productService.filterProducts(query1));
					modelAndView.setViewName("Vendor-AddProduct");
					}
					
					//modelAndView.addObject("products", productService.filterProducts(query1));
					
					return modelAndView;
				}
				
				
				@RequestMapping(value="VendorShowProductByProductIdController", method=RequestMethod.POST)
				public ModelAndView getProductsByCategoryVendor(@ModelAttribute Product product)
		
				{
					String productType = product.getProductId();
					String query1 = "from Product where productId= '"+productType+"'"; 
				
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("products", productService.filterProducts(query1));
				
					modelAndView.setViewName("Vendor-AddProduct");
					
					return modelAndView;
				}
				
				
				
				
				

	
}
	