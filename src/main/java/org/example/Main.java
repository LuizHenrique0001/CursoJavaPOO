package org.example;


import org.example.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String path = sc.nextLine();

		File sourceFile = new File(path);
		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "/out").mkdir();

		String targetFilesStr = sourceFolderStr + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double prince = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, prince, quantity));
				itemCsv = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilesStr))){

				for (Product item: list){
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}