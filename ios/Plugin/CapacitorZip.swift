import Foundation

@objc public class CapacitorZip: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
