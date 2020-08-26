from math import pi, sqrt

class Rectangle:
    '''a class to implement a basic geometric rectangle'''

    def __init__(self,xCenter = 0.0, yCenter = 0.0, length=1.0, width=1.0,):
        '''default Rectangle is centered at origin with a length and width of 1.0'''

        self.x = xCenter
        self.y = yCenter
        self.width = width
        self.length = length

    def area(self):
        '''returns the area of this rectangle'''
        return self.width*self.length
        
    def perimeter(self):
        '''returns the perimeter of this rectangle'''
        return 2*self.length+2*self.width

    def intersects(self, otherRectangle):
        '''returns True if this cricle and otherRectange intersect'''


        #Different conditions when intersects is false: 

            #Condition 1: When left edge of self is on the right of otherRectangles's right edge.
            #Condition 2: When right edge of self is on the left of otherRectangles's left edge. 
            #Condition 3: When top edge of self is on bottom of otherRectangles's bottom edge. 
            #Condition 4: When bottom edge of self is on top of otherRectangles's top edge. 
        
        #1: Calculate the different edges of both rectangles

        #self
        leftEdgeOfSelf = self.x-self.length/2
        rightEdgeOfSelf = self.x+self.length/2
        topEdgeOfSelf = self.y+self.width/2
        bottomEdgeOfSelf = self.y-self.width/2

        #other rectangle
        leftEdgeOfOtherRectangle = otherRectangle.x+otherRectangle.length/2
        rightEdgeOfOtherRectangle = otherRectangle.x-otherRectangle.length/2
        topEdgeOfOtherRectangle = otherRectangle.y+otherRectangle.width/2
        bottomEdgeOfOtherRectangle = otherRectangle.y-otherRectangle.width/2

        #2: Go through the conditions above return False
        return not ((leftEdgeOfSelf>rightEdgeOfOtherRectangle) or (rightEdgeOfSelf<leftEdgeOfOtherRectangle)) and ((topEdgeOfSelf<bottomEdgeOfOtherRectangle) or (bottomEdgeOfSelf>topEdgeOfOtherRectangle)) 
        

    def getX(self):
        return self.x

    def getY(self):
        return self.y

    def getWidth(self):
        return self.width  

    def getLength(self):
        return self.length      

    def __str__(self):
        '''returns string representation of a rectangle'''

        return self.__repr__()

    def __repr__(self):
        '''representation of a rectangle object is its string representation'''

        return "This rectangle has a length of " + self.length + " and a width of " + self.width + " and a center of (" + self.x + "," + self.y + ")"

class Square(Rectangle):
    '''a class to implement a basic geometric square from Rectangle'''

    def __init__(self, xCenter=0.0, yCenter=0.0, length=1.0):
        super().__init__(length=length, width=length, xCenter=xCenter, yCenter=yCenter)

class Circle:
    '''a class to implement a basic geometric circle'''

    def __init__(self, xCenter = 0.0, yCenter = 0.0, radius = 1.0):
        '''default circle is centered at origin with radius of 1.0'''

        self.x = xCenter
        self.y = yCenter
        self.radius = radius

    def area(self):
        '''returns area of this circle'''
        return pi * self.radius * self.radius

    def circumference(self):
        '''returns circumference of this circle'''
        return 2* pi * self.radius

    def intersects(self, otherCircle):
        '''returns True if this circle and otherCircle intersect'''
        # 1. compute the sum S of the radii of the 2 circles
        S = self.radius + otherCircle.getRadius()

        # 2. compute the distance D between the 2 centers
        D = sqrt( (self.x - otherCircle.getX()) * (self.x - otherCircle.getX()) +
                      (self.y - otherCircle.getY()) * (self.y - otherCircle.getY()) )

        # 3. return D <= S
        return D <= S

    def getX(self):
        return self.x

    def getY(self):
        return self.y

    def getRadius(self):
        return self.radius
    

    def __str__(self):
        '''returns string representation of a circle'''

        return self.__repr__()

    def __repr__(self):
        '''representation of a circle object is its string representation'''
        
        result = "A circle of radius " + str(self.radius)
        result += " centered at (" + str(self.x) + "," + str(self.y) + ")"

        return result
