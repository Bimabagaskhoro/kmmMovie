import SwiftUI
import shared

struct HomeSceen: View {
	let greet = Greeting().greet()

	var body: some View {
		Text(greet)
	}
}

struct HomeSceen_Previews: PreviewProvider {
	static var previews: some View {
		HomeSceen()
	}
}
